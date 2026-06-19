package org.whysexplorer.content

import org.whysexplorer.models.{DifficultyLevel, Question}

object RemainingCategoryQuestions {

  // ── TECHNOLOGY ─────────────────────────────────────────────
  val technology: List[Question] = List(

    Question("tech-001", "technology",
      "How does a touchscreen know where you touch it?",
      "Your finger is slightly electrically conductive — it can carry a tiny electrical charge. A touchscreen has a grid of invisible electrical sensors spread across the glass. When your finger touches the screen, it disturbs the electrical field at that exact point, like dipping a finger into a still pond and creating ripples. The phone's computer detects exactly which sensors were disturbed and calculates your finger's position — up to 120 times per second!",
      DifficultyLevel.Medium,
      Some("/assets/images/tech/touchscreen.avif"), Some("/assets/animations/tech/touch-grid.json"),
      Some("/assets/audio/en/tech-001.mp3"),
      List("Touchscreens don't work with regular gloves because fabric blocks your finger's tiny electrical charge from reaching the sensors. Special 'touchscreen gloves' have conductive tips!",
           "The first touchscreen was invented in 1965 by British engineer E.A. Johnson — more than 20 years before personal computers became common."),
      List("technology","screens","electricity","phones"), 8, 12),

    Question("tech-002", "technology",
      "How does Wi-Fi send information through the air?",
      "Your router converts data — photos, videos, web pages — into a pattern of radio wave pulses, then broadcasts them in every direction like a radio station. Your phone or laptop has an antenna that picks up those pulses and converts them back into data. The whole thing happens at the speed of light, which is why streaming video feels instant. Wi-Fi radio waves pass through walls because they're much longer than the gaps between atoms in concrete or wood.",
      DifficultyLevel.Medium,
      Some("/assets/images/tech/wifi.avif"), Some("/assets/animations/tech/radio-waves.json"),
      Some("/assets/audio/en/tech-002.mp3"),
      List("Wi-Fi signals and FM radio are both radio waves — the main difference is that Wi-Fi uses much higher frequencies, which can carry far more data but don't travel as far.",
           "5G phone signals use even higher-frequency waves that carry massive amounts of data but struggle to pass through walls — that's why you need more 5G towers than 4G towers."),
      List("technology","wifi","radio waves","internet"), 8, 12),

    Question("tech-003", "technology",
      "How does a camera take a photo?",
      "A camera works like your eye, but records what it sees. A glass lens focuses light from the scene you're photographing onto a tiny sensor inside the camera. The sensor is covered in millions of microscopic light-detecting pixels. For a split second, a shutter opens and lets light hit those pixels. Each pixel records how much red, green, and blue light landed on it. The camera's computer then combines all those millions of colour readings to build one image.",
      DifficultyLevel.Simple,
      Some("/assets/images/tech/camera.avif"), Some("/assets/animations/tech/camera-shutter.json"),
      Some("/assets/audio/en/tech-003.mp3"),
      List("The very first photograph ever taken required an 8-hour exposure to sunlight — so early portraits are ghostly because people couldn't stay perfectly still for that long!",
           "A modern smartphone actually takes about 12 photos simultaneously in burst mode, then uses AI to pick the sharpest parts from each one to build the final image."),
      List("technology","camera","light","photography"), 8, 12),

    Question("tech-004", "technology",
      "How does a car engine work?",
      "A petrol engine is basically a controlled explosion machine. Fuel and air are pulled into a cylinder, and a piston squeezes them tightly together. A spark plug fires a spark, which ignites the mixture and causes a small explosion. The expanding gas pushes the piston down hard. A connecting rod turns that up-down motion into rotation, which ultimately spins the wheels. Most engines have 4 cylinders firing one after another, so the power flow is smooth and continuous.",
      DifficultyLevel.Advanced,
      Some("/assets/images/tech/engine.avif"), Some("/assets/animations/tech/piston.json"),
      Some("/assets/audio/en/tech-004.mp3"),
      List("An electric motor has only about 20 moving parts. A petrol engine has hundreds. That's why electric cars need far less maintenance — far fewer parts to wear out!",
           "Petrol contains a huge amount of stored energy. One litre of petrol, if converted perfectly to motion with zero waste, would be enough energy to lift a 1-tonne car 3 kilometres into the air."),
      List("technology","cars","engines","machines"), 8, 12),

    Question("tech-005", "technology",
      "How does a computer store information?",
      "Everything a computer stores — photos, games, music, words — is secretly just a very long string of ones and zeros, called binary. Each one or zero is stored by a tiny electronic switch: on means 1, off means 0. A modern solid-state drive (SSD) uses microscopic cells that can trap electrons (1) or release them (0). Your phone might contain over a trillion of these switches in a chip the size of your thumbnail.",
      DifficultyLevel.Advanced,
      Some("/assets/images/tech/computer-storage.avif"), None,
      Some("/assets/audio/en/tech-005.mp3"),
      List("The word 'bit' stands for Binary digIT — the single smallest piece of information a computer can store. Eight bits make one byte, and a gigabyte is one billion bytes!",
           "If you printed every photo on a typical smartphone as a standard photo, you'd have a stack of paper taller than Mount Everest."),
      List("technology","computers","binary","storage"), 8, 12)
  )

  // ── PLANTS ─────────────────────────────────────────────────
  val plants: List[Question] = List(

    Question("plants-001", "plants",
      "Why do sunflowers turn toward the Sun?",
      "Young sunflower stems have a plant growth hormone called auxin. Auxin runs away from sunlight — it collects on the shaded side of the stem. That shaded side with extra auxin grows faster than the sunny side, which bends the whole stem toward the light. This is called phototropism. Here's the twist: fully grown sunflowers stop moving. They permanently face east, warming up early morning bees that come to collect pollen.",
      DifficultyLevel.Medium,
      Some("/assets/images/plants/sunflower.avif"), Some("/assets/animations/plants/sunflower-turn.json"),
      Some("/assets/audio/en/plants-001.mp3"),
      List("Look at the seeds in a sunflower head. The spirals always come in pairs of Fibonacci numbers — like 21 spirals one way and 34 the other. This packing pattern fits the most seeds possible into the circle!",
           "Sunflowers absorb heavy metals and radiation from contaminated soil. They were planted near Chernobyl after the nuclear disaster to help clean the land."),
      List("plants","sunflower","phototropism","hormones"), 8, 12),

    Question("plants-002", "plants",
      "Why do plants need sunlight?",
      "Plants are solar-powered food factories. Inside their leaves are millions of tiny green structures called chloroplasts. Chloroplasts use sunlight as the energy source to combine water (from the roots) and carbon dioxide (from the air) to make sugar — the plant's food. This process is called photosynthesis, and it also releases oxygen as a by-product. Every breath of oxygen you take in came from plants or ocean algae doing photosynthesis — they literally made the air you breathe.",
      DifficultyLevel.Simple,
      Some("/assets/images/plants/photosynthesis.avif"), Some("/assets/animations/plants/photosynthesis.json"),
      Some("/assets/audio/en/plants-002.mp3"),
      List("A single large tree produces enough oxygen in one day to supply the breathing needs of 4 people for that same day!",
           "The Amazon rainforest generates around 20% of Earth's oxygen. It's sometimes called the 'lungs of the planet'."),
      List("plants","photosynthesis","sunlight","oxygen"), 8, 12),

    Question("plants-003", "plants",
      "Why do some plants eat insects?",
      "The Venus flytrap grows in bogs where the soil is so poor in nutrients — especially nitrogen — that eating insects is the only way to get what it needs. The trap has tiny trigger hairs inside. The plant only snaps shut if two different hairs are touched within 20 seconds — it won't waste energy on a raindrop or a bit of blowing leaf. Once an insect is trapped, the plant slowly digests it over about 10 days, absorbing the nutrients.",
      DifficultyLevel.Medium,
      Some("/assets/images/plants/venus-flytrap.avif"), Some("/assets/animations/plants/flytrap-snap.json"),
      Some("/assets/audio/en/plants-003.mp3"),
      List("The Venus flytrap snaps shut in less than one-tenth of a second — one of the fastest movements in the plant kingdom!",
           "There are over 600 species of carnivorous plants worldwide. The largest, Nepenthes rajah from Borneo, makes pitchers big enough to trap small frogs and even rats."),
      List("plants","carnivorous","adaptation","insects"), 8, 12),

    Question("plants-004", "plants",
      "How do trees communicate underground?",
      "Beneath any forest, tree roots are wrapped in a web of fungal threads so dense that a teaspoon of forest soil contains kilometres of them. This network (called mycorrhizae) connects trees to each other. Trees share sugar with the fungi in exchange for water and minerals. But they also use the network to send chemical signals to neighbours when insects attack, and mother trees actually send extra sugar to their own seedlings growing in shade. Scientists call it the Wood Wide Web.",
      DifficultyLevel.Advanced,
      Some("/assets/images/plants/mycelium.avif"), Some("/assets/animations/plants/mycelium.json"),
      Some("/assets/audio/en/plants-004.mp3"),
      List("The largest living organism on Earth is a honey fungus network in Oregon, USA, covering 9.6 square kilometres and estimated to be 8,650 years old!",
           "When a tree is cut down, neighbouring trees sometimes keep its stump alive for decades by pumping sugar to its roots through the fungal network."),
      List("plants","fungi","trees","network","communication"), 8, 12),

    Question("plants-005", "plants",
      "Why do flowers have bright colours and sweet smells?",
      "Flowers need to be pollinated — they need insects and birds to carry their pollen from one flower to another. Bright colours and sweet smells are basically an advertisement billboard: 'Free food here! Come get our nectar!' When a bee lands to drink the nectar, it accidentally gets pollen stuck to its body. When it visits the next flower, some of that pollen rubs off and fertilises it. The flower gets pollinated; the bee gets fed. It's a win-win deal that's been running for over 130 million years.",
      DifficultyLevel.Simple,
      Some("/assets/images/plants/flowers-pollination.avif"), Some("/assets/animations/plants/bee-flower.json"),
      Some("/assets/audio/en/plants-005.mp3"),
      List("Bees can see ultraviolet light, which is invisible to us. Many flowers have secret UV patterns on their petals — like hidden arrows pointing straight to the nectar — only visible to bees!",
           "Some sneaky plants, like the carrion flower, have evolved to smell like rotting meat to attract flies as pollinators instead of bees."),
      List("plants","flowers","pollination","insects","colour"), 8, 12)
  )

  // ── HISTORY ────────────────────────────────────────────────
  val history: List[Question] = List(

    Question("history-001", "history",
      "Why did people build the pyramids?",
      "The ancient Egyptians built pyramids as the ultimate resting places for their pharaohs — their god-kings. They believed the pharaoh's spirit needed a permanent, powerful home to travel safely to the afterlife. The pyramid shape might represent the angled rays of the Sun reaching down from the sky. The builders packed the pyramid with everything the pharaoh would need after death: food, treasure, furniture, even servants' statues. The Great Pyramid took about 20 years and 20,000 workers to complete.",
      DifficultyLevel.Simple,
      Some("/assets/images/history/pyramids.avif"), None,
      Some("/assets/audio/en/history-001.mp3"),
      List("The Great Pyramid of Giza contains over 2.3 million stone blocks. Some single blocks weigh up to 80 tonnes — heavier than a space shuttle!",
           "The workers who built the pyramids weren't slaves. Archaeological evidence shows they were well-paid skilled workers who received food, clothing, medical care, and were buried with honour when they died."),
      List("egypt","history","pyramids","ancient"), 8, 12),

    Question("history-002", "history",
      "Why did ancient Romans build roads?",
      "The Roman Empire was enormous — stretching from Britain to Iraq — and controlling it required moving armies quickly. A soldier marching on muddy tracks might cover 20 km a day. On a Roman road, a well-trained army could cover 40 km. The roads were engineered masterpieces: layers of gravel, crushed stone, and large flat paving stones, with drainage ditches on both sides to stop them getting waterlogged. The same road network also carried trade goods, tax collectors, and official government messages.",
      DifficultyLevel.Medium,
      Some("/assets/images/history/roman-road.avif"), None,
      Some("/assets/audio/en/history-002.mp3"),
      List("At its height, the Roman road network stretched over 400,000 km — long enough to go around Earth 10 times!",
           "The saying 'All roads lead to Rome' is historically accurate — every major Roman road physically connected back to a golden milestone in the centre of Rome."),
      List("rome","history","roads","engineering"), 8, 12),

    Question("history-003", "history",
      "Why did people invent writing?",
      "The very first writing wasn't poetry or stories — it was accounting! The earliest known writing, from ancient Mesopotamia (modern-day Iraq) around 3400 BCE, was clay tablets recording how much grain was stored, how many sheep a farmer owned, and who owed money to whom. Writing was invented because people needed to remember deals and quantities that were too complex to hold in memory. Once the technology existed, people quickly expanded it to record laws, religion, and eventually stories and history.",
      DifficultyLevel.Medium,
      Some("/assets/images/history/cuneiform.avif"), None,
      Some("/assets/audio/en/history-003.mp3"),
      List("The world's first named author in history is a woman — Enheduanna, a Sumerian high priestess who wrote religious hymns around 2285 BCE. Her name has been remembered for over 4,300 years!",
           "Chinese, Mayan, Sumerian, and Egyptian writing were all invented independently, with no connection to each other. Humans in different parts of the world came up with the same brilliant idea on their own."),
      List("writing","history","ancient","language"), 8, 12),

    Question("history-004", "history",
      "Why did knights wear armour?",
      "Medieval battles were extremely dangerous — swords, axes, lances, and arrows flying everywhere. A suit of steel plate armour could deflect slashing swords and absorb the impact of blows that would otherwise kill you. Well-made armour was also surprisingly flexible: a fit knight could run, climb a ladder, and even do cartwheels in it, because the plates were carefully shaped to move with the joints. The problem was cost — a full suit was as expensive as buying several houses.",
      DifficultyLevel.Simple,
      Some("/assets/images/history/knight-armour.avif"), None,
      Some("/assets/audio/en/history-004.mp3"),
      List("Armourers designed plates at clever angles to deflect arrow tips sideways rather than letting them punch straight through. The shape of the armour was as important as its thickness.",
           "A full suit of plate armour weighed 15–25 kg — similar to a loaded school backpack, but distributed over your whole body instead of just your shoulders."),
      List("knights","armour","medieval","history"), 8, 12),

    Question("history-005", "history",
      "Why did ancient Greeks hold the Olympics?",
      "The ancient Greeks held the Olympics every four years at the sacred site of Olympia as a religious festival to honour Zeus, king of the gods. Athletes from city-states that were usually at war with each other would all agree to a truce and compete peacefully. The prize wasn't gold or money — it was a crown of olive leaves cut from a sacred tree. But winning made you famous across the entire Greek world for life, which was considered worth far more than any prize.",
      DifficultyLevel.Simple,
      Some("/assets/images/history/olympics.avif"), None,
      Some("/assets/audio/en/history-005.mp3"),
      List("The ancient Olympics ran continuously for over 1,200 years — from 776 BCE to 393 CE — when a Roman emperor cancelled them as 'pagan' events. The modern Olympics were only restarted in 1896!",
           "Ancient Greek Olympic athletes competed completely naked. The word 'gymnasium' comes from the Greek word 'gymnos' meaning naked."),
      List("greece","olympics","history","sports"), 8, 12)
  )

  // ── FOOD ───────────────────────────────────────────────────
  val food: List[Question] = List(

    Question("food-001", "food",
      "Why does chopping onions make you cry?",
      "Onions are basically chemical warfare vegetables. They store a sulphur-based compound that would taste terrible and deter animals from eating them. When you cut an onion, you burst its cells and release enzymes that react with that compound to create a new gas. That gas floats up to your eyes and dissolves in the film of liquid covering them, forming a weak acid. Your eyes immediately try to flush it away with extra tears — which is why you cry even though you're not actually sad.",
      DifficultyLevel.Medium,
      Some("/assets/images/food/onion-cry.avif"), Some("/assets/animations/food/onion-molecule.json"),
      Some("/assets/audio/en/food-001.mp3"),
      List("Chilling onions in the fridge before cutting slows down the enzyme reaction — cold onions release much less of the gas and cause fewer tears!",
           "Scientists in New Zealand genetically engineered a tearless onion by switching off the enzyme gene. It tastes exactly the same but never makes you cry."),
      List("food","chemistry","vegetables","onion"), 8, 12),

    Question("food-002", "food",
      "Why does food taste different when you have a blocked nose?",
      "Here's a surprising truth: about 80% of what you think is 'taste' is actually smell. Your tongue can only detect five basic tastes: sweet, salty, sour, bitter, and savoury (umami). Everything else — the difference between strawberry and raspberry, or milk chocolate and dark chocolate — is detected by your nose as you chew. The smells from food travel up the back of your throat to your nose while you eat. Block your nose and suddenly everything tastes like a bland mix of sweet, sour, and salty.",
      DifficultyLevel.Medium,
      Some("/assets/images/food/taste-smell.avif"), None,
      Some("/assets/audio/en/food-002.mp3"),
      List("Try this experiment: hold your nose shut, close your eyes, and get someone to feed you a piece of apple and a piece of raw potato without telling you which is which. Most people cannot tell the difference!",
           "Astronauts on the International Space Station say food tastes very bland. In space, body fluids shift toward the head and stuff up their nasal passages — like having a permanent blocked nose."),
      List("food","taste","smell","senses"), 8, 12),

    Question("food-003", "food",
      "Why does chocolate taste so good?",
      "Chocolate is scientifically designed to hit multiple pleasure systems in your brain at once. The sugar triggers sweetness receptors. The fat creates a rich, creamy texture. Chocolate also contains theobromine (a mild stimulant similar to caffeine) and compounds that slow your brain from breaking down its own 'bliss chemical' — called anandamide. Plus, chocolate melts at exactly body temperature (34°C), which gives it that unique 'melting in your mouth' sensation no other food quite matches.",
      DifficultyLevel.Advanced,
      Some("/assets/images/food/chocolate.avif"), Some("/assets/animations/food/chocolate-melt.json"),
      Some("/assets/audio/en/food-003.mp3"),
      List("Chocolate melts at exactly 34°C — just below body temperature — which is why it melts perfectly on your tongue but stays solid in your hand until you've been holding it for a while.",
           "It takes around 400 cocoa beans — the entire production of roughly 10 cocoa trees for a whole year — to make just 450 grams of chocolate."),
      List("food","chocolate","chemistry","brain"), 8, 12),

    Question("food-004", "food",
      "Why does bread go mouldy?",
      "Mould spores are floating around you in the air all the time — you're breathing them right now, but there are so few that they do nothing. When a spore lands on bread, it finds perfect conditions: carbohydrates for food, some moisture, and warmth. The spore germinates, grows a tangle of thread-like roots into the bread, and starts digesting the bread's nutrients to fuel its growth. What you see as a fuzzy patch is millions of upright spore-producing stalks — the mould is literally trying to spread its seeds.",
      DifficultyLevel.Simple,
      Some("/assets/images/food/mouldy-bread.avif"), None,
      Some("/assets/audio/en/food-004.mp3"),
      List("Alexander Fleming discovered penicillin — the world's first antibiotic and one of medicine's greatest breakthroughs — when he noticed a mould on a forgotten petri dish was killing all the bacteria around it!",
           "Refrigerators slow mould growth because mould is cold-blooded like all fungi — the colder it is, the more slowly it grows. Freezing stops it almost completely."),
      List("food","mould","biology","fungi"), 8, 12),

    Question("food-005", "food",
      "Why do we cook food?",
      "Cooking was possibly the single most important invention in human history. Heat kills harmful bacteria and parasites that can make you seriously ill. It also breaks down the tough cell walls in plants and the connective tissue in meat, so your body can extract far more energy and nutrients from the same amount of food. And cooking triggers a chemical reaction called the Maillard reaction that creates hundreds of new flavour molecules — the smell of toasted bread, roasted coffee, and grilled meat all come from this reaction.",
      DifficultyLevel.Medium,
      Some("/assets/images/food/cooking.avif"), Some("/assets/animations/food/maillard.json"),
      Some("/assets/audio/en/food-005.mp3"),
      List("The Maillard reaction — the browning that happens when you toast bread or sear a steak — creates over 600 different flavour and aroma molecules at once. That's why cooked food smells so much more complex than raw food!",
           "Some anthropologists believe that the invention of cooking is what allowed human brains to grow so large. Cooked food delivers far more energy per bite, fuelling bigger brains over millions of years of evolution."),
      List("food","cooking","chemistry","biology"), 8, 12)
  )

  val all: List[Question] = technology ++ plants ++ history ++ food
}
