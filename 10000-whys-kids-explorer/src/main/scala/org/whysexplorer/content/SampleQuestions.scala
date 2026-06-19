package org.whysexplorer.content

import org.whysexplorer.models.{DifficultyLevel, Question}

object SampleQuestions {

  val animals: List[Question] = List(
    Question(
      id = "animals-001", categoryId = "animals",
      text = "Why do cats purr?",
      answer = "Cats purr by rapidly moving their larynx muscles while breathing. It can mean they are happy, but cats also purr to calm themselves when they are scared or unwell — like a self-soothing superpower!",
      difficulty = DifficultyLevel.Simple,
      imageUrl = Some("/assets/images/animals/cat-purring.avif"),
      animationUrl = Some("/assets/animations/animals/cat-purr.json"),
      audioNarrationUrl = Some("/assets/audio/en/animals-001.mp3"),
      funFacts = List(
        "A cat's purr vibrates between 25 and 150 Hz — the same range that can heal bones!",
        "Big cats like tigers can roar but cannot purr continuously like house cats."
      ),
      tags = List("cats", "sound", "mammals"), ageMin = 4, ageMax = 12
    ),
    Question(
      id = "animals-002", categoryId = "animals",
      text = "Why do birds sing in the morning?",
      answer = "Birds sing at dawn to announce their territory and attract mates. The air is calm and still in the morning, so their songs travel farther and sound clearer — nature's perfect radio broadcast!",
      difficulty = DifficultyLevel.Simple,
      imageUrl = Some("/assets/images/animals/bird-singing.avif"),
      animationUrl = Some("/assets/animations/animals/bird-sing.json"),
      audioNarrationUrl = Some("/assets/audio/en/animals-002.mp3"),
      funFacts = List(
        "The dawn chorus happens 30 minutes before sunrise.",
        "Some birds, like lyrebirds, can mimic chainsaws and camera shutters!"
      ),
      tags = List("birds", "sound", "behavior"), ageMin = 4, ageMax = 12
    ),
    Question(
      id = "animals-003", categoryId = "animals",
      text = "Why do elephants have big ears?",
      answer = "Elephants use their enormous ears like fans and radiators. Blood flows through the thin skin of their ears, cools down in the air, and goes back into their body — a built-in air conditioner!",
      difficulty = DifficultyLevel.Medium,
      imageUrl = Some("/assets/images/animals/elephant-ears.avif"),
      animationUrl = Some("/assets/animations/animals/elephant-fan.json"),
      audioNarrationUrl = Some("/assets/audio/en/animals-003.mp3"),
      funFacts = List(
        "African elephants have bigger ears than Asian elephants because Africa is hotter.",
        "Elephants can hear sounds through their feet using vibrations."
      ),
      tags = List("elephants", "adaptation", "heat"), ageMin = 5, ageMax = 12
    ),
    Question(
      id = "animals-004", categoryId = "animals",
      text = "Why do fish have scales?",
      answer = "Scales are a fish's armour! They protect against predators, parasites, and rough surfaces. They also reduce drag in water so the fish can swim fast — like a built-in wetsuit.",
      difficulty = DifficultyLevel.Simple,
      imageUrl = Some("/assets/images/animals/fish-scales.avif"),
      animationUrl = None,
      audioNarrationUrl = Some("/assets/audio/en/animals-004.mp3"),
      funFacts = List(
        "You can tell a fish's age by counting the growth rings on its scales — just like a tree!",
        "Some fish, like sharks, have scales that are actually tiny teeth called denticles."
      ),
      tags = List("fish", "scales", "adaptation"), ageMin = 5, ageMax = 12
    ),
    Question(
      id = "animals-005", categoryId = "animals",
      text = "Why do chameleons change colour?",
      answer = "Chameleons change colour mainly to communicate mood and temperature — not just to hide! Special cells called iridophores reflect light differently when the cells expand or contract, like tiny living mirrors.",
      difficulty = DifficultyLevel.Advanced,
      imageUrl = Some("/assets/images/animals/chameleon.avif"),
      animationUrl = Some("/assets/animations/animals/chameleon-change.json"),
      audioNarrationUrl = Some("/assets/audio/en/animals-005.mp3"),
      funFacts = List(
        "A stressed chameleon turns dark; a calm one turns bright.",
        "Chameleons' eyes can look in two different directions at the same time!"
      ),
      tags = List("reptiles", "camouflage", "color"), ageMin = 7, ageMax = 12
    )
  )

  val space: List[Question] = List(
    Question(
      id = "space-001", categoryId = "space",
      text = "Why is the sky blue?",
      answer = "Sunlight contains all colours mixed together. When sunlight enters our atmosphere, air molecules scatter blue light in all directions more than other colours — so we see blue everywhere we look up!",
      difficulty = DifficultyLevel.Simple,
      imageUrl = Some("/assets/images/space/blue-sky.avif"),
      animationUrl = Some("/assets/animations/space/scattering.json"),
      audioNarrationUrl = Some("/assets/audio/en/space-001.mp3"),
      funFacts = List(
        "The sky on Mars is pinkish-red because of dust in its atmosphere.",
        "At sunset, blue light scatters away leaving red and orange — that's why sunsets are colourful!"
      ),
      tags = List("sky", "light", "atmosphere"), ageMin = 4, ageMax = 12
    ),
    Question(
      id = "space-002", categoryId = "space",
      text = "Why do stars twinkle?",
      answer = "Stars actually shine steadily — but their light passes through layers of moving air in Earth's atmosphere. The air bends the light in different directions every second, making stars appear to twinkle from our point of view.",
      difficulty = DifficultyLevel.Medium,
      imageUrl = Some("/assets/images/space/twinkling-stars.avif"),
      animationUrl = Some("/assets/animations/space/twinkle.json"),
      audioNarrationUrl = Some("/assets/audio/en/space-002.mp3"),
      funFacts = List(
        "Planets don't twinkle as much as stars because they appear bigger and steadier.",
        "Stars in space don't twinkle — only from Earth's surface!"
      ),
      tags = List("stars", "light", "atmosphere"), ageMin = 5, ageMax = 12
    ),
    Question(
      id = "space-003", categoryId = "space",
      text = "Why is there no sound in space?",
      answer = "Sound needs particles to travel through — like air or water. Space is almost completely empty, with almost no particles. Without anything to carry the vibrations, sound waves simply can't exist there.",
      difficulty = DifficultyLevel.Medium,
      imageUrl = Some("/assets/images/space/astronaut-space.avif"),
      animationUrl = Some("/assets/animations/space/no-sound.json"),
      audioNarrationUrl = Some("/assets/audio/en/space-003.mp3"),
      funFacts = List(
        "Astronauts talk to each other by radio inside helmets — voice waves travel through the suit material.",
        "Scientists detected actual sound waves inside a black hole cluster in 2022 — but at a pitch too low to hear!"
      ),
      tags = List("space", "sound", "vacuum"), ageMin = 6, ageMax = 12
    ),
    Question(
      id = "space-004", categoryId = "space",
      text = "Why does the Moon look different every night?",
      answer = "The Moon doesn't change shape — we just see different amounts of its sunlit side as it orbits Earth. This 29-day cycle of shapes is called the lunar phases, from new moon to full moon and back.",
      difficulty = DifficultyLevel.Simple,
      imageUrl = Some("/assets/images/space/moon-phases.avif"),
      animationUrl = Some("/assets/animations/space/moon-phases.json"),
      audioNarrationUrl = Some("/assets/audio/en/space-004.mp3"),
      funFacts = List(
        "The Moon is moving away from Earth by about 3.8 cm every year.",
        "A full moon is 14 times brighter than a half moon!"
      ),
      tags = List("moon", "phases", "orbit"), ageMin = 4, ageMax = 12
    ),
    Question(
      id = "space-005", categoryId = "space",
      text = "Why do astronauts float in space?",
      answer = "Astronauts float because they are in free fall! Their spacecraft orbits Earth by constantly falling toward it while also moving sideways fast enough to keep missing it. This weightless feeling is called microgravity.",
      difficulty = DifficultyLevel.Advanced,
      imageUrl = Some("/assets/images/space/floating-astronaut.avif"),
      animationUrl = Some("/assets/animations/space/orbit.json"),
      audioNarrationUrl = Some("/assets/audio/en/space-005.mp3"),
      funFacts = List(
        "Astronauts grow up to 5 cm taller in space because the spine stretches without gravity.",
        "Water floats as blobs in space — astronauts drink from sealed bags!"
      ),
      tags = List("astronauts", "gravity", "orbit"), ageMin = 7, ageMax = 12
    )
  )

  val all: List[Question] = animals ++ space
}

/** Aggregates every seed question across all 9 categories. */
object AllQuestions {

  val all: List[Question] =
    SampleQuestions.animals ++
    AnimalsQuestions.all ++
    SampleQuestions.space ++
    SpaceQuestions.all ++
    HumanBodyQuestions.all ++
    EarthNatureQuestions.all ++
    EverydayScienceQuestions.all ++
    RemainingCategoryQuestions.all

  def byCategory(categoryId: String): List[Question] =
    all.filter(_.categoryId == categoryId)

  val stats: Map[String, Int] =
    all.groupBy(_.categoryId).map { case (k, v) => k -> v.size }
}
