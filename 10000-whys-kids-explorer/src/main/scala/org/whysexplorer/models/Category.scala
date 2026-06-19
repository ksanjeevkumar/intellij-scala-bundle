package org.whysexplorer.models

case class Category(
  id: String,
  name: String,
  description: String,
  mascotName: String,
  mascotImageUrl: String,
  backgroundColorHex: String,
  animationUrl: Option[String],
  questionCount: Int,
  phase: Int = 1
)

object Category {
  val Animals: Category = Category(
    id = "animals",
    name = "Animals",
    description = "Discover the wild wonders of the animal kingdom!",
    mascotName = "Ollie the Owl",
    mascotImageUrl = "/assets/mascots/ollie-owl.svg",
    backgroundColorHex = "#FFF3E0",
    animationUrl = Some("/assets/animations/animals-intro.json"),
    questionCount = 500
  )

  val Space: Category = Category(
    id = "space",
    name = "Space & Universe",
    description = "Blast off into the mysteries of the cosmos!",
    mascotName = "Nova the Rocket",
    mascotImageUrl = "/assets/mascots/nova-rocket.svg",
    backgroundColorHex = "#E8EAF6",
    animationUrl = Some("/assets/animations/space-intro.json"),
    questionCount = 300
  )

  val HumanBody: Category = Category(
    id = "human-body",
    name = "Human Body",
    description = "Explore the amazing machine you live in!",
    mascotName = "Bodie the Robot",
    mascotImageUrl = "/assets/mascots/bodie-robot.svg",
    backgroundColorHex = "#FCE4EC",
    animationUrl = Some("/assets/animations/body-intro.json"),
    questionCount = 400
  )

  val EarthNature: Category = Category(
    id = "earth-nature",
    name = "Earth & Nature",
    description = "Uncover the secrets of our incredible planet!",
    mascotName = "Terra the Leaf",
    mascotImageUrl = "/assets/mascots/terra-leaf.svg",
    backgroundColorHex = "#E8F5E9",
    animationUrl = Some("/assets/animations/earth-intro.json"),
    questionCount = 350
  )

  val EverydayScience: Category = Category(
    id = "everyday-science",
    name = "Everyday Science",
    description = "Science is everywhere — even in your kitchen!",
    mascotName = "Sparky the Bulb",
    mascotImageUrl = "/assets/mascots/sparky-bulb.svg",
    backgroundColorHex = "#FFFDE7",
    animationUrl = Some("/assets/animations/science-intro.json"),
    questionCount = 500
  )

  val Technology: Category = Category(
    id = "technology",
    name = "Technology & Machines",
    description = "How do the gadgets around us really work?",
    mascotName = "Gizmo the Gear",
    mascotImageUrl = "/assets/mascots/gizmo-gear.svg",
    backgroundColorHex = "#E3F2FD",
    animationUrl = Some("/assets/animations/tech-intro.json"),
    questionCount = 250
  )

  val Plants: Category = Category(
    id = "plants",
    name = "Plants & Environment",
    description = "Grow your knowledge about the green world!",
    mascotName = "Fern the Sprout",
    mascotImageUrl = "/assets/mascots/fern-sprout.svg",
    backgroundColorHex = "#F1F8E9",
    animationUrl = Some("/assets/animations/plants-intro.json"),
    questionCount = 200
  )

  val History: Category = Category(
    id = "history",
    name = "History & Culture",
    description = "Travel through time and meet amazing civilizations!",
    mascotName = "Chrono the Scroll",
    mascotImageUrl = "/assets/mascots/chrono-scroll.svg",
    backgroundColorHex = "#FFF8E1",
    animationUrl = Some("/assets/animations/history-intro.json"),
    questionCount = 200
  )

  val Food: Category = Category(
    id = "food",
    name = "Food & Daily Life",
    description = "Why does food taste good? Let's find out!",
    mascotName = "Yumi the Chef",
    mascotImageUrl = "/assets/mascots/yumi-chef.svg",
    backgroundColorHex = "#FBE9E7",
    animationUrl = Some("/assets/animations/food-intro.json"),
    questionCount = 300
  )

  val all: List[Category] = List(
    Animals, Space, HumanBody, EarthNature, EverydayScience,
    Technology, Plants, History, Food
  )
}
