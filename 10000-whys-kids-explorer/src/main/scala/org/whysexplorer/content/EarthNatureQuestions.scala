package org.whysexplorer.content

import org.whysexplorer.models.{DifficultyLevel, Question}

object EarthNatureQuestions {

  val all: List[Question] = List(

    Question("earth-001", "earth-nature",
      "Why does it rain?",
      "The Sun heats water in oceans, rivers, and lakes, turning it into invisible water vapour that rises into the sky. High up in the cold air, the vapour cools and turns back into tiny water droplets, forming clouds. When millions of droplets join together and become heavy enough, they fall back down as rain — completing the water cycle!",
      DifficultyLevel.Simple,
      Some("/assets/images/earth/rain.avif"), Some("/assets/animations/earth/water-cycle.json"),
      Some("/assets/audio/en/earth-001.mp3"),
      List("The average raindrop falls at about 9 km/h — it would take over 7 minutes to fall from a cloud to the ground!",
           "All the water on Earth is billions of years old — the same water has been cycling continuously."),
      List("rain","water cycle","clouds","weather"), 4, 12),

    Question("earth-002", "earth-nature",
      "Why do volcanoes erupt?",
      "Deep inside the Earth, rock melts into magma under extreme heat and pressure. This liquid rock is lighter than solid rock around it, so it slowly rises — like bubbles in a lava lamp. When it finds a weak spot or crack in the crust, it bursts through as an eruption, spewing lava, ash, and gases.",
      DifficultyLevel.Medium,
      Some("/assets/images/earth/volcano.avif"), Some("/assets/animations/earth/volcano-erupt.json"),
      Some("/assets/audio/en/earth-002.mp3"),
      List("Hawaii is formed entirely by volcanic eruptions from the ocean floor — and is still growing!",
           "The ash from a huge volcanic eruption can circle the whole Earth and cool global temperatures for years."),
      List("volcano","geology","earth","lava"), 5, 12),

    Question("earth-003", "earth-nature",
      "Why does the Earth have seasons?",
      "Earth is tilted on its axis at 23.5 degrees. As Earth orbits the Sun, sometimes the Northern Hemisphere tilts toward the Sun (summer — more direct sunlight and longer days) and sometimes it tilts away (winter — less direct sunlight and shorter days). Seasons are caused by tilt, NOT by distance from the Sun!",
      DifficultyLevel.Medium,
      Some("/assets/images/earth/seasons.avif"), Some("/assets/animations/earth/seasons.json"),
      Some("/assets/audio/en/earth-003.mp3"),
      List("When it's summer in the Northern Hemisphere, it's winter in the Southern Hemisphere — and vice versa!",
           "If Earth had no tilt, every day of the year would be the same length everywhere."),
      List("seasons","earth","sun","orbit","tilt"), 5, 12),

    Question("earth-004", "earth-nature",
      "Why do we have earthquakes?",
      "Earth's outer shell (the crust) is broken into giant pieces called tectonic plates that float on molten rock. These plates move a few centimetres every year. When two plates grind past each other, get stuck, and then suddenly slip — the released energy sends shockwaves through the ground. That's an earthquake!",
      DifficultyLevel.Medium,
      Some("/assets/images/earth/earthquake.avif"), Some("/assets/animations/earth/plates.json"),
      Some("/assets/audio/en/earth-004.mp3"),
      List("About 500,000 earthquakes happen every year — most are too small to feel.",
           "The 'Ring of Fire' around the Pacific Ocean has 90% of the world's earthquakes."),
      List("earthquake","geology","tectonic plates","earth"), 6, 12),

    Question("earth-005", "earth-nature",
      "Why is the ocean salty?",
      "Rivers pick up tiny amounts of salt and minerals from rocks as they flow to the sea. Over billions of years, this tiny trickle of salt has built up. The Sun evaporates the water but leaves the salt behind — so it keeps concentrating. Underwater volcanoes also add minerals directly from inside the Earth.",
      DifficultyLevel.Simple,
      Some("/assets/images/earth/ocean-salt.avif"), None,
      Some("/assets/audio/en/earth-005.mp3"),
      List("If you spread all the ocean's salt on land, it would cover every continent in a 150-metre-thick layer!",
           "The Dead Sea is so salty (9 times saltier than normal ocean) that you float without swimming."),
      List("ocean","salt","geology","rivers"), 5, 12),

    Question("earth-006", "earth-nature",
      "Why do rainbows appear after rain?",
      "Each raindrop acts like a tiny prism. Sunlight enters the drop, bounces off the inside back wall, and exits — but the different colours of light exit at slightly different angles. Red bends least, violet most. When millions of raindrops each split the light, you see all the colours spread across the sky in an arc.",
      DifficultyLevel.Medium,
      Some("/assets/images/earth/rainbow.avif"), Some("/assets/animations/earth/rainbow.json"),
      Some("/assets/audio/en/earth-006.mp3"),
      List("A rainbow is actually a full circle — you just can't see the bottom half because the ground is in the way. From an aeroplane, you can see a complete rainbow ring!",
           "Double rainbows occur when light bounces twice inside a raindrop. The second bow has colours reversed."),
      List("rainbow","light","rain","colour"), 5, 12),

    Question("earth-007", "earth-nature",
      "Why do leaves change colour in autumn?",
      "Green leaves contain chlorophyll, which captures sunlight for photosynthesis. As days get shorter and colder in autumn, trees prepare to rest. They stop producing chlorophyll, so the green fades. Hidden underneath were always yellow and orange pigments! Red and purple pigments are actually created fresh in autumn from trapped sugars.",
      DifficultyLevel.Medium,
      Some("/assets/images/earth/autumn-leaves.avif"), Some("/assets/animations/earth/leaf-change.json"),
      Some("/assets/audio/en/earth-007.mp3"),
      List("Bright, sunny autumn days with cold nights make the most vivid red colours — the sugars need sunlight to make the red pigment.",
           "Deciduous trees drop their leaves to prevent water loss — a leaf loses a lot of water through tiny pores."),
      List("trees","autumn","leaves","photosynthesis","seasons"), 6, 12),

    Question("earth-008", "earth-nature",
      "Why does thunder come after lightning?",
      "Lightning and thunder happen at exactly the same time — but light travels roughly one million times faster than sound! Light from the flash reaches your eyes almost instantly (300,000 km/s). Sound from the same bolt travels at only 343 m/s, so you hear the rumble seconds later. Count the seconds to estimate how far away the storm is.",
      DifficultyLevel.Simple,
      Some("/assets/images/earth/lightning.avif"), Some("/assets/animations/earth/lightning.json"),
      Some("/assets/audio/en/earth-008.mp3"),
      List("Every second of delay between the flash and the thunder means the lightning struck about 340 metres away.",
           "A single lightning bolt contains enough energy to toast 100,000 slices of bread!"),
      List("lightning","thunder","storm","sound","light"), 5, 12)
  )
}
