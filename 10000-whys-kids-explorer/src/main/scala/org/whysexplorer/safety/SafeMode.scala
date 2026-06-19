package org.whysexplorer.safety

object SafeMode {

  private var enabled: Boolean = true

  def isEnabled: Boolean = enabled

  def enable(): Unit  = { enabled = true }
  def disable(): Unit = { enabled = false }

  def sanitizeUrl(url: String): Option[String] =
    if (!enabled) Some(url)
    else if (isInternalUrl(url)) Some(url)
    else None

  def isExternalLinkBlocked: Boolean = enabled

  def filterAds: Boolean = enabled

  private def isInternalUrl(url: String): Boolean =
    url.startsWith("/") || url.startsWith("assets://") || url.startsWith("app://")
}
