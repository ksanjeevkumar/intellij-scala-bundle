package org.whysexplorer.content

import org.whysexplorer.models.{DifficultyLevel, Question}

object SampleQuestions {

  val animals: List[Question] = List(
    Question(
      id = "animals-001", categoryId = "animals",
      text = "Why do cats purr?",
      answer = "Inside a cat's throat there are tiny muscles that vibrate super fast — about 25 times a second — and that makes the purring sound. Cats purr when they're happy, but here's the surprising part: they also purr when they're hurt or scared. It's like how you might hum quietly to calm yourself down before a big test. The vibrations actually help cats feel better!",
      difficulty = DifficultyLevel.Simple,
      imageUrl = Some("/assets/images/animals/cat-purring.avif"),
      animationUrl = Some("/assets/animations/animals/cat-purr.json"),
      audioNarrationUrl = Some("/assets/audio/en/animals-001.mp3"),
      funFacts = List(
        "A cat's purr vibrates at the same speed as a bone-healing machine used in hospitals!",
        "Big cats like tigers and lions can roar, but they can't purr nonstop like a house cat can."
      ),
      tags = List("cats", "sound", "mammals"), ageMin = 8, ageMax = 12
    ),
    Question(
      id = "animals-002", categoryId = "animals",
      text = "Why do birds sing in the morning?",
      answer = "Birds are basically sending a message to the whole neighbourhood: 'This is MY tree, stay away!' Early morning air is cool and still, so sound travels much farther than it does in the afternoon heat. Singing at dawn is like choosing the best signal for your phone — birds figured out that early morning is when their songs reach the most other birds.",
      difficulty = DifficultyLevel.Simple,
      imageUrl = Some("/assets/images/animals/bird-singing.avif"),
      animationUrl = Some("/assets/animations/animals/bird-sing.json"),
      audioNarrationUrl = Some("/assets/audio/en/animals-002.mp3"),
      funFacts = List(
        "The morning bird chorus starts about 30 minutes before sunrise, even before it's fully light!",
        "The lyrebird from Australia can copy the sound of a chainsaw, a camera shutter, and even other birds."
      ),
      tags = List("birds", "sound", "behavior"), ageMin = 8, ageMax = 12
    ),
    Question(
      id = "animals-003", categoryId = "animals",
      text = "Why do elephants have big ears?",
      answer = "Elephant ears are basically giant cooling fans built into their body. Hot blood flows through hundreds of tiny blood vessels just under the thin skin of the ear. When the elephant flaps its ears, cool air passes over them and the blood loses heat — then that cooled blood travels back into the body. Africa is really hot, so elephants there have even bigger ears than elephants in Asia.",
      difficulty = DifficultyLevel.Medium,
      imageUrl = Some("/assets/images/animals/elephant-ears.avif"),
      animationUrl = Some("/assets/animations/animals/elephant-fan.json"),
      audioNarrationUrl = Some("/assets/audio/en/animals-003.mp3"),
      funFacts = List(
        "African elephants have much bigger ears than Asian ones — because Africa gets hotter!",
        "Elephants can also 'hear' through their feet. Vibrations from the ground travel up their legs and into their ears."
      ),
      tags = List("elephants", "adaptation", "heat"), ageMin = 8, ageMax = 12
    ),
    Question(
      id = "animals-004", categoryId = "animals",
      text = "Why do fish have scales?",
      answer = "Think of scales as a fish's armour suit. They overlap like roof tiles to protect the fish from rocks, predators, and parasites. They also make the fish's body smooth and slippery in water, so it cuts through like a sports car instead of a box. Without scales, swimming would take way more energy.",
      difficulty = DifficultyLevel.Simple,
      imageUrl = Some("/assets/images/animals/fish-scales.avif"),
      animationUrl = None,
      audioNarrationUrl = Some("/assets/audio/en/animals-004.mp3"),
      funFacts = List(
        "Just like cutting a tree to count its rings, you can count the rings on a fish's scale to find out how old it is!",
        "Shark 'scales' are actually tiny teeth called denticles — which is why shark skin feels like sandpaper."
      ),
      tags = List("fish", "scales", "adaptation"), ageMin = 8, ageMax = 12
    ),
    Question(
      id = "animals-005", categoryId = "animals",
      text = "Why do chameleons change colour?",
      answer = "Most people think chameleons change colour to hide, but that's not the main reason. They mostly change colour to show their mood — like a living emoji! Inside their skin are tiny crystal cells that can squeeze together or spread apart. This changes how light bounces off them, switching the colour from green to red to yellow in seconds. A calm chameleon looks bright and colourful; an angry one goes dark.",
      difficulty = DifficultyLevel.Advanced,
      imageUrl = Some("/assets/images/animals/chameleon.avif"),
      animationUrl = Some("/assets/animations/animals/chameleon-change.json"),
      audioNarrationUrl = Some("/assets/audio/en/animals-005.mp3"),
      funFacts = List(
        "Each eye of a chameleon moves on its own — it can look forward with one eye and backward with the other at the same time!",
        "A stressed chameleon turns dark brownish-black. A happy one turns bright green or yellow."
      ),
      tags = List("reptiles", "camouflage", "color"), ageMin = 8, ageMax = 12
    )
  )

  val space: List[Question] = List(
    Question(
      id = "space-001", categoryId = "space",
      text = "Why is the sky blue?",
      answer = "Sunlight looks white but it secretly contains every colour mixed together. When that light hits the air above us, the tiny air molecules bump into it and scatter the colours. Blue light bounces around way more than red or yellow because it travels in shorter, bouncier waves. So wherever you look up, there's blue light scattering into your eyes — making the whole sky look blue!",
      difficulty = DifficultyLevel.Simple,
      imageUrl = Some("/assets/images/space/blue-sky.avif"),
      animationUrl = Some("/assets/animations/space/scattering.json"),
      audioNarrationUrl = Some("/assets/audio/en/space-001.mp3"),
      funFacts = List(
        "The sky on Mars looks a pinky-orange colour because Martian dust bounces light differently to Earth's air.",
        "At sunset, sunlight travels through much more air to reach you, so all the blue bounces away — leaving just orange and red."
      ),
      tags = List("sky", "light", "atmosphere"), ageMin = 8, ageMax = 12
    ),
    Question(
      id = "space-002", categoryId = "space",
      text = "Why do stars twinkle?",
      answer = "Stars don't actually flicker — they're huge and steady. The twinkling happens in our atmosphere. As starlight travels down to Earth, it passes through pockets of air at different temperatures that are always moving around. Each pocket bends the light a tiny bit differently, so your eye keeps getting the light from slightly different angles every split second. It looks like twinkling, but the star itself is perfectly still. Planets look steadier because they're closer and appear bigger, so the wobbling is harder to notice.",
      difficulty = DifficultyLevel.Medium,
      imageUrl = Some("/assets/images/space/twinkling-stars.avif"),
      animationUrl = Some("/assets/animations/space/twinkle.json"),
      audioNarrationUrl = Some("/assets/audio/en/space-002.mp3"),
      funFacts = List(
        "Astronauts in space see stars as sharp, steady points of light — no twinkling at all!",
        "Astronomers actually hate the twinkling effect because it blurs their telescope images. That's why big telescopes are built on tall mountains or put in space."
      ),
      tags = List("stars", "light", "atmosphere"), ageMin = 8, ageMax = 12
    ),
    Question(
      id = "space-003", categoryId = "space",
      text = "Why is there no sound in space?",
      answer = "Sound is basically a shaking motion that travels from one particle to the next — like a wave in a line of dominoes. But space is almost completely empty. There are no air molecules lined up to pass the shaking along. So even if an entire planet exploded right next to you, you wouldn't hear a thing. Every explosion you see in space movies is completely made up — real space is totally silent.",
      difficulty = DifficultyLevel.Medium,
      imageUrl = Some("/assets/images/space/astronaut-space.avif"),
      animationUrl = Some("/assets/animations/space/no-sound.json"),
      audioNarrationUrl = Some("/assets/audio/en/space-003.mp3"),
      funFacts = List(
        "Astronauts can't shout to each other in space even a metre apart — they have to use radios inside their helmets.",
        "In 2022 scientists found sound waves travelling through a cloud of hot gas around a black hole. But the pitch is a million billion times too low for human ears to hear!"
      ),
      tags = List("space", "sound", "vacuum"), ageMin = 8, ageMax = 12
    ),
    Question(
      id = "space-004", categoryId = "space",
      text = "Why does the Moon look different every night?",
      answer = "The Moon itself doesn't change shape at all — it's always a sphere. What changes is how much of its sunlit side is facing us as it travels around Earth each month. When the Moon is between Earth and the Sun, none of the lit side faces us — that's a new moon (invisible). Two weeks later it's on the other side of Earth and we see the fully lit side — that's a full moon. The shapes in between are called phases.",
      difficulty = DifficultyLevel.Simple,
      imageUrl = Some("/assets/images/space/moon-phases.avif"),
      animationUrl = Some("/assets/animations/space/moon-phases.json"),
      audioNarrationUrl = Some("/assets/audio/en/space-004.mp3"),
      funFacts = List(
        "The Moon is slowly drifting away from Earth — about 3.8 centimetres farther every single year.",
        "A full moon looks 14 times brighter than a half moon, even though only twice as much surface is lit!"
      ),
      tags = List("moon", "phases", "orbit"), ageMin = 8, ageMax = 12
    ),
    Question(
      id = "space-005", categoryId = "space",
      text = "Why do astronauts float in space?",
      answer = "Here's the mind-bending truth: astronauts are actually falling the whole time! The space station is constantly falling toward Earth, but it's also moving sideways so fast (about 28,000 km/h) that it keeps missing Earth. It's like throwing a ball so hard it curves over the horizon instead of landing. When you're in free fall, everything around you feels weightless — that's why astronauts float. Gravity is still there; they're just falling alongside everything else.",
      difficulty = DifficultyLevel.Advanced,
      imageUrl = Some("/assets/images/space/floating-astronaut.avif"),
      animationUrl = Some("/assets/animations/space/orbit.json"),
      audioNarrationUrl = Some("/assets/audio/en/space-005.mp3"),
      funFacts = List(
        "Astronauts grow up to 5 cm taller in space because their spine stretches out without gravity squishing it down.",
        "Water doesn't pour in space — it floats as wobbly blobs. Astronauts drink from sealed bags with straws."
      ),
      tags = List("astronauts", "gravity", "orbit"), ageMin = 8, ageMax = 12
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
