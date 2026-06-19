package org.whysexplorer.content

import org.whysexplorer.models.{DifficultyLevel, Question}

object EverydayScienceQuestions {

  val all: List[Question] = List(

    Question("science-001", "everyday-science",
      "Why does ice float on water?",
      "Almost every substance sinks when it freezes, because the solid form is denser and more compact. Water does something totally unique. When it freezes into ice, the water molecules arrange themselves into a special hexagonal (six-sided) crystal pattern that actually takes up more space than liquid water. More space means less density — and less dense things float. This is incredibly lucky for life on Earth: lakes freeze from the top down, leaving liquid water underneath where fish survive all winter.",
      DifficultyLevel.Medium,
      Some("/assets/images/science/ice-float.avif"), Some("/assets/animations/science/ice-lattice.json"),
      Some("/assets/audio/en/science-001.mp3"),
      List("If ice sank like almost every other frozen substance, lakes would freeze solid from the bottom up every winter and kill all the fish and plants inside them.",
           "Water is the only common substance on Earth that naturally exists as a solid, liquid, and gas all at the same time in nature."),
      List("water","ice","density","states of matter"), 8, 12),

    Question("science-002", "everyday-science",
      "Why does a boiled egg turn hard while a raw egg is liquid?",
      "A raw egg white is made of protein molecules coiled up loosely in water, like tangled headphone cables. When you add heat, the proteins unfold and then tangle together with other proteins, forming a firm solid mesh that traps the water inside it — like a sponge that's been squeezed and locked. This is called denaturing, and the key thing to know is: it can never be reversed. Once you've boiled an egg, no amount of cooling will make it liquid again.",
      DifficultyLevel.Advanced,
      Some("/assets/images/science/boiled-egg.avif"), Some("/assets/animations/science/protein-denature.json"),
      Some("/assets/audio/en/science-002.mp3"),
      List("Ceviche — raw fish 'cooked' without any heat in lime juice — works because the acid in the lime denatures the proteins just like heat would!",
           "Scientists in California found a way to nearly 'unboil' an egg using a chemical that breaks the protein tangles apart. It took days of spinning in a special machine."),
      List("food","chemistry","proteins","heat"), 8, 12),

    Question("science-003", "everyday-science",
      "Why does soap clean dirty hands?",
      "Soap molecules have a brilliant double life. One end of each molecule loves water and one end loves grease. When you lather up, the grease-loving ends bury themselves into the oil and dirt on your hands. The water-loving ends stick out toward the water. When you rinse, the water grabs those ends and pulls the whole molecule — along with all the grease and trapped bacteria — off your hand and down the drain. Water alone can't do this because oil and water refuse to mix.",
      DifficultyLevel.Medium,
      Some("/assets/images/science/soap.avif"), Some("/assets/animations/science/soap-molecule.json"),
      Some("/assets/audio/en/science-003.mp3"),
      List("The COVID-19 virus has a fatty outer layer. Soap dissolves that layer in about 20 seconds, destroying the virus completely — which is why washing hands is so effective.",
           "Soap was being made at least 4,500 years ago in ancient Babylon. They made it from animal fat and wood ash."),
      List("soap","chemistry","hygiene","molecules"), 8, 12),

    Question("science-004", "everyday-science",
      "Why do magnets attract metal?",
      "Inside materials like iron, tiny groups of atoms act like microscopic magnets. In most materials these mini-magnets all point in random directions and cancel each other out — so there's no overall magnetic force. In a magnet, something has made all those mini-magnets line up in the same direction, so their forces all add together into one powerful pull. When a magnet gets near iron, it nudges the iron's mini-magnets into alignment too — and suddenly the iron is attracted.",
      DifficultyLevel.Advanced,
      Some("/assets/images/science/magnets.avif"), Some("/assets/animations/science/magnetic-domains.json"),
      Some("/assets/audio/en/science-004.mp3"),
      List("If you cut a magnet in half, you don't get one north piece and one south piece — you get two complete smaller magnets, each with their own north and south ends. You can keep cutting and it keeps happening!",
           "Earth is a giant magnet! Liquid iron churning in Earth's outer core generates a magnetic field that shields us from deadly solar wind particles."),
      List("magnets","physics","atoms","force"), 8, 12),

    Question("science-005", "everyday-science",
      "Why does bread rise when baked?",
      "Bread dough is full of yeast — tiny single-celled living creatures that eat the sugars in flour and breathe out carbon dioxide gas, just like you breathe out CO₂. The stretchy gluten protein in flour traps all those tiny bubbles, making the dough puff up like a slowly inflating balloon. When you bake the dough, the heat kills the yeast, expands the bubbles one last time, and hardens the gluten structure into place. All those holes you see in bread are the exact spots where yeast bubbles used to be.",
      DifficultyLevel.Medium,
      Some("/assets/images/science/bread-rise.avif"), Some("/assets/animations/science/yeast-bubbles.json"),
      Some("/assets/audio/en/science-005.mp3"),
      List("Sourdough bread is made with wild yeast captured from the air. Some sourdough starters are over 100 years old — bakers keep them alive and pass them down like a family heirloom!",
           "Bread flour has much more gluten than cake flour, which is why bread is chewy and stretchy but cake is soft and crumbly."),
      List("food","yeast","chemistry","biology"), 8, 12),

    Question("science-006", "everyday-science",
      "Why does a prism split white light into colours?",
      "White light is secretly a mix of all colours travelling together. When light goes from air into glass, it slows down. Here's the key: each colour slows down by a slightly different amount. Violet slows the most, red slows the least. Because they slow down by different amounts, they each bend at a different angle as they enter the glass — spreading apart into a fan. When they exit the other side, they're separated into their individual colours: red, orange, yellow, green, blue, violet.",
      DifficultyLevel.Advanced,
      Some("/assets/images/science/prism.avif"), Some("/assets/animations/science/prism-split.json"),
      Some("/assets/audio/en/science-006.mp3"),
      List("Isaac Newton was the first person to prove that white light contains all the colours, using a glass prism in 1666. Before that, people thought the prism was adding colour to the light!",
           "A diamond has an extremely high refractive index — meaning it bends light much more than glass, which is why diamonds sparkle with such vivid colours."),
      List("light","colour","physics","prism"), 8, 12),

    Question("science-007", "everyday-science",
      "Why does a ball thrown upward come back down?",
      "When you throw a ball up, your arm gives it energy that pushes it against Earth's gravity. Gravity is constantly pulling every object toward the centre of the Earth, all the time, without stopping. As the ball rises, gravity slows it down a little bit every second. Eventually the ball runs out of upward energy, pauses for a tiny moment at the top, and then gravity wins completely and pulls it back down. On the Moon, where gravity is six times weaker, you could throw the same ball six times higher.",
      DifficultyLevel.Simple,
      Some("/assets/images/science/ball-throw.avif"), Some("/assets/animations/science/gravity-arc.json"),
      Some("/assets/audio/en/science-007.mp3"),
      List("If you threw a ball sideways fast enough — about 28,000 km/h — it would never land. Earth's surface would curve away as fast as the ball falls, and it would become a satellite!",
           "In the vacuum of space, with no air resistance, a feather and a bowling ball fall at exactly the same speed. Astronauts have proved this on the Moon."),
      List("gravity","physics","force","motion"), 8, 12)
  )
}
