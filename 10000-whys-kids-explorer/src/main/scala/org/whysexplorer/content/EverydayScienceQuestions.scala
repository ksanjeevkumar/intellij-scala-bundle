package org.whysexplorer.content

import org.whysexplorer.models.{DifficultyLevel, Question}

object EverydayScienceQuestions {

  val all: List[Question] = List(

    Question("science-001", "everyday-science",
      "Why does ice float on water?",
      "Most liquids are denser than their solid form, so the solid sinks. Water is special! When it freezes, water molecules form a hexagonal crystal lattice that actually takes up more space than liquid water — making ice less dense. This is why ice floats, and it's critical for life: lakes freeze from the top down, leaving liquid water under the ice where fish survive.",
      DifficultyLevel.Medium,
      Some("/assets/images/science/ice-float.avif"), Some("/assets/animations/science/ice-lattice.json"),
      Some("/assets/audio/en/science-001.mp3"),
      List("If ice sank, lakes would freeze solid from bottom to top and kill almost all aquatic life every winter!",
           "Water is the only common substance that expands when it freezes."),
      List("water","ice","density","states of matter"), 7, 12),

    Question("science-002", "everyday-science",
      "Why does a boiled egg turn hard while a raw egg is liquid?",
      "Egg white is made of long protein molecules coiled loosely in water. Heat makes the proteins uncoil and tangle together, trapping the water and turning runny liquid into firm solid — a process called denaturing. Importantly, this change is irreversible: you can never unboil an egg!",
      DifficultyLevel.Advanced,
      Some("/assets/images/science/boiled-egg.avif"), Some("/assets/animations/science/protein-denature.json"),
      Some("/assets/audio/en/science-002.mp3"),
      List("Acids also denature proteins — ceviche (raw fish 'cooked' in lime juice) uses this chemistry!",
           "Scientists in California actually found a way to unfold proteins using a chemical and a centrifuge — almost like unboiling an egg."),
      List("food","chemistry","proteins","heat"), 9, 12),

    Question("science-003", "everyday-science",
      "Why does soap clean dirty hands?",
      "Soap molecules have two ends: one end loves water (hydrophilic) and one loves oil (hydrophobic). The oil-loving end grabs onto grease and germs, while the water-loving end points outward. When you rinse, water carries everything away — soap bridges the gap between oil and water, something water alone can't do.",
      DifficultyLevel.Medium,
      Some("/assets/images/science/soap.avif"), Some("/assets/animations/science/soap-molecule.json"),
      Some("/assets/audio/en/science-003.mp3"),
      List("The COVID-19 virus has a fatty outer layer — soap dissolves it, destroying the virus!",
           "Ancient Romans used a natural soap called 'sapo' made from animal fat and wood ash."),
      List("soap","chemistry","hygiene","molecules"), 7, 12),

    Question("science-004", "everyday-science",
      "Why do magnets attract metal?",
      "In iron and some other metals, tiny groups of atoms called 'domains' act like microscopic magnets. Normally they point in random directions and cancel out. In a magnet, all the domains align in the same direction — their forces add up into one strong pull. Iron is attracted because the magnet reorganises iron's domains to point toward it.",
      DifficultyLevel.Advanced,
      Some("/assets/images/science/magnets.avif"), Some("/assets/animations/science/magnetic-domains.json"),
      Some("/assets/audio/en/science-004.mp3"),
      List("If you cut a magnet in half, you get two smaller magnets — each with its own north and south pole!",
           "Earth is a giant magnet! Its liquid iron core generates a magnetic field that protects us from solar wind."),
      List("magnets","physics","atoms","force"), 8, 12),

    Question("science-005", "everyday-science",
      "Why does bread rise when baked?",
      "Bread dough contains yeast — tiny living fungi. Yeast eats the sugars in flour and releases carbon dioxide gas as a by-product (just like we exhale CO₂). The stretchy gluten in flour traps these millions of tiny gas bubbles, making the dough puff up. Heat in the oven sets the structure permanently, so bread stays fluffy.",
      DifficultyLevel.Medium,
      Some("/assets/images/science/bread-rise.avif"), Some("/assets/animations/science/yeast-bubbles.json"),
      Some("/assets/audio/en/science-005.mp3"),
      List("Sourdough bread uses wild yeast and bacteria caught from the air — some sourdough starters are over 100 years old!",
           "The holes in bread are exactly the air pockets left by yeast bubbles."),
      List("food","yeast","chemistry","biology"), 6, 12),

    Question("science-006", "everyday-science",
      "Why does a prism split white light into colours?",
      "White light is a mixture of all colours travelling at the same speed in air. When light enters glass (or water), each colour slows down by a slightly different amount — violet slows most, red least. This difference causes each colour to bend at a different angle (refraction), spreading them apart into the rainbow spectrum we see.",
      DifficultyLevel.Advanced,
      Some("/assets/images/science/prism.avif"), Some("/assets/animations/science/prism-split.json"),
      Some("/assets/audio/en/science-006.mp3"),
      List("Isaac Newton was the first to show that white light is made of all colours, using a prism in 1666!",
           "A diamond splits light into vivid colours for the same reason — very high refractive index."),
      List("light","colour","physics","prism"), 8, 12),

    Question("science-007", "everyday-science",
      "Why does a ball thrown upward come back down?",
      "Gravity! Earth's gravity pulls every object toward the centre of the planet. When you throw a ball up, your arm gives it energy that pushes it against gravity. But gravity is always pulling it back. The ball slows down, stops for a split second at its highest point, then gravity wins and pulls it back down.",
      DifficultyLevel.Simple,
      Some("/assets/images/science/ball-throw.avif"), Some("/assets/animations/science/gravity-arc.json"),
      Some("/assets/audio/en/science-007.mp3"),
      List("On the Moon, where gravity is 6 times weaker, you could throw a ball 6 times higher with the same effort!",
           "If you throw a ball horizontally fast enough (about 28,000 km/h), it would orbit the Earth instead of landing."),
      List("gravity","physics","force","motion"), 4, 12)
  )
}
