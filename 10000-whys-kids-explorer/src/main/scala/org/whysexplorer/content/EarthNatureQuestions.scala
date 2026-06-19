package org.whysexplorer.content

import org.whysexplorer.models.{DifficultyLevel, Question}

object EarthNatureQuestions {

  val all: List[Question] = List(

    Question("earth-001", "earth-nature",
      "Why does it rain?",
      "The Sun heats the surface of oceans, lakes, and rivers, turning water into an invisible gas called water vapour that floats upward. High up in the sky where the air is cold, that vapour cools down and turns back into tiny liquid droplets, which clump together to form clouds. When millions of droplets join and the cloud gets too heavy to hold them, they fall back to Earth as rain. Then the whole cycle starts over — the same water has been doing this loop for billions of years.",
      DifficultyLevel.Simple,
      Some("/assets/images/earth/rain.avif"), Some("/assets/animations/earth/water-cycle.json"),
      Some("/assets/audio/en/earth-001.mp3"),
      List("A typical raindrop falls at about 9 km/h. It would take more than 7 minutes to fall from the cloud all the way to the ground!",
           "The water in your glass right now has been cycling through clouds, rivers, and oceans for billions of years. You might be drinking the same water a dinosaur once drank."),
      List("rain","water cycle","clouds","weather"), 8, 12),

    Question("earth-002", "earth-nature",
      "Why do volcanoes erupt?",
      "Deep underground, rock gets so hot that it melts into a red-hot liquid called magma. Magma is lighter than the solid rock around it, so it slowly floats upward — like a bubble rising through thick syrup. When magma finds a crack or weak spot in Earth's outer layer (the crust), it bursts through to the surface. Once it comes out, we call it lava. The eruption can also shoot out clouds of ash and gases that travel around the whole planet.",
      DifficultyLevel.Medium,
      Some("/assets/images/earth/volcano.avif"), Some("/assets/animations/earth/volcano-erupt.json"),
      Some("/assets/audio/en/earth-002.mp3"),
      List("The Hawaiian Islands were built entirely by underwater volcanoes that erupted from the ocean floor. Hawaii is still growing today — one eruption at a time!",
           "The 1815 eruption of Mount Tambora in Indonesia was so powerful it blocked out sunlight worldwide, causing crops to fail across Europe and America. 1816 is known as 'The Year Without a Summer'."),
      List("volcano","geology","earth","lava"), 8, 12),

    Question("earth-003", "earth-nature",
      "Why does the Earth have seasons?",
      "Earth is tilted sideways at 23.5 degrees — like a spinning top that's leaning. As Earth travels around the Sun each year, sometimes the top half (Northern Hemisphere) leans toward the Sun and sometimes it leans away. When your half tilts toward the Sun, sunlight hits more directly and the days are longer — that's summer. When it tilts away, sunlight is weaker and the days are shorter — that's winter. Seasons are about the tilt, not about being closer or farther from the Sun!",
      DifficultyLevel.Medium,
      Some("/assets/images/earth/seasons.avif"), Some("/assets/animations/earth/seasons.json"),
      Some("/assets/audio/en/earth-003.mp3"),
      List("When it's summer in the Northern Hemisphere (UK, USA, India), it's winter in the Southern Hemisphere (Australia, South Africa) — they have Christmas during their summer!",
           "If Earth weren't tilted at all, every single day of the year would be exactly the same length everywhere on the planet. No seasons, ever."),
      List("seasons","earth","sun","orbit","tilt"), 8, 12),

    Question("earth-004", "earth-nature",
      "Why do we have earthquakes?",
      "Earth's outer shell is cracked into about 15 giant pieces called tectonic plates, a bit like a cracked eggshell. These plates are floating on hot, slow-moving rock and creeping a few centimetres every year. Most of the time the movement is so slow you can't feel it. But sometimes two plates get stuck against each other, and pressure builds up for decades or centuries. When they finally slip and jolt past each other, the energy releases all at once as an earthquake — like a rubber band that's been stretched and suddenly snaps.",
      DifficultyLevel.Medium,
      Some("/assets/images/earth/earthquake.avif"), Some("/assets/animations/earth/plates.json"),
      Some("/assets/audio/en/earth-004.mp3"),
      List("About 500,000 earthquakes happen every year around the world. Most are so tiny that only sensitive instruments can detect them.",
           "The area around the edges of the Pacific Ocean is called the 'Ring of Fire' because 90% of the world's earthquakes happen there, where plates are constantly grinding against each other."),
      List("earthquake","geology","tectonic plates","earth"), 8, 12),

    Question("earth-005", "earth-nature",
      "Why is the ocean salty?",
      "Rain falls on land and slowly flows down rivers to the sea. As it travels, it dissolves tiny amounts of salt and minerals from the rocks it passes over — the way water can dissolve sugar. That salty water reaches the ocean, but when the Sun evaporates the water back into clouds, it leaves all the salt behind. Over billions of years, this tiny trickle of salt has built up and concentrated. Underwater volcanoes on the ocean floor also constantly add minerals directly from inside the Earth.",
      DifficultyLevel.Simple,
      Some("/assets/images/earth/ocean-salt.avif"), None,
      Some("/assets/audio/en/earth-005.mp3"),
      List("If you took all the salt out of the ocean and spread it over land, it would cover every continent on Earth in a layer 150 metres deep — taller than a 40-storey building!",
           "The Dead Sea between Israel and Jordan is 9 times saltier than normal ocean water. It's so dense that you float on the surface without even trying to swim."),
      List("ocean","salt","geology","rivers"), 8, 12),

    Question("earth-006", "earth-nature",
      "Why do rainbows appear after rain?",
      "Each tiny raindrop in the air works like a glass prism. When a beam of sunlight enters a raindrop, it slows down and bends slightly. Different colours of light bend by different amounts — red bends the least, violet the most. The light bounces off the inside back wall of the drop, then bends again as it exits, separating the colours into a fan. When millions of raindrops all do this at the same time, you see all the colours spread across the sky in a huge arc.",
      DifficultyLevel.Medium,
      Some("/assets/images/earth/rainbow.avif"), Some("/assets/animations/earth/rainbow.json"),
      Some("/assets/audio/en/earth-006.mp3"),
      List("A rainbow is actually a full circle — you're only seeing the top half because the ground cuts it off! From an aeroplane, you can see a complete ring rainbow below you.",
           "In a double rainbow, the second, fainter arc has the colours in the exact opposite order — red on the inside instead of the outside. This happens when light bounces twice inside each raindrop."),
      List("rainbow","light","rain","colour"), 8, 12),

    Question("earth-007", "earth-nature",
      "Why do leaves change colour in autumn?",
      "Leaves are green because of chlorophyll — the green chemical they use to capture sunlight and make food. But chlorophyll is expensive for the tree to make, so as days get shorter and colder, the tree cuts off supplies to its leaves and the chlorophyll breaks down and fades. Underneath the green, yellow and orange pigments were hidden there all along — now they're finally revealed. The red and purple colours are actually brand new: they're made from trapped sugars as the leaf dries out.",
      DifficultyLevel.Medium,
      Some("/assets/images/earth/autumn-leaves.avif"), Some("/assets/animations/earth/leaf-change.json"),
      Some("/assets/audio/en/earth-007.mp3"),
      List("The most vivid red colours happen after a warm sunny autumn day followed by a cold night. The sunny day makes more sugar in the leaf, and the cold night traps it there to make the red pigment.",
           "Trees drop their leaves to survive winter without losing water. Each leaf loses water through tiny pores all day — in winter, a tree with no leaves loses much less."),
      List("trees","autumn","leaves","photosynthesis","seasons"), 8, 12),

    Question("earth-008", "earth-nature",
      "Why does thunder come after lightning?",
      "Lightning and thunder are created at exactly the same instant. The difference is how fast they travel. Light zooms through the atmosphere at 300,000 km per second — so you see the flash almost instantly. But sound travels through air at only 0.34 km per second — about 900,000 times slower. The rumble of thunder takes time to reach you. Count the seconds between the flash and the sound, multiply by 340, and you get the distance in metres — your very own lightning calculator.",
      DifficultyLevel.Simple,
      Some("/assets/images/earth/lightning.avif"), Some("/assets/animations/earth/lightning.json"),
      Some("/assets/audio/en/earth-008.mp3"),
      List("A single lightning bolt is about 5 times hotter than the surface of the Sun — reaching 30,000°C in a fraction of a second!",
           "One lightning bolt contains enough electrical energy to power a 60-watt light bulb for about 3 months if you could capture it all."),
      List("lightning","thunder","storm","sound","light"), 8, 12)
  )
}
