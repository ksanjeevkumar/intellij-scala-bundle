package org.whysexplorer.content

import org.whysexplorer.models.{DifficultyLevel, Question}

/** Technology, Plants, History, and Food questions — Phase 1 seed set. */
object RemainingCategoryQuestions {

  // ── TECHNOLOGY ─────────────────────────────────────────────
  val technology: List[Question] = List(

    Question("tech-001", "technology",
      "How does a touchscreen know where you touch it?",
      "Most modern screens use a grid of tiny electrical sensors. Your finger is slightly conductive, so touching the screen disrupts the electrical field at that exact spot. The phone's processor detects which sensors were disrupted and calculates your finger's precise position — up to 120 times per second!",
      DifficultyLevel.Medium,
      Some("/assets/images/tech/touchscreen.avif"), Some("/assets/animations/tech/touch-grid.json"),
      Some("/assets/audio/en/tech-001.mp3"),
      List("Capacitive screens (used in phones) don't work with regular gloves — the fabric blocks your electricity!",
           "The first touchscreen was invented in 1965, long before smartphones."),
      List("technology","screens","electricity","phones"), 6, 12),

    Question("tech-002", "technology",
      "How does Wi-Fi send information through the air?",
      "Wi-Fi uses invisible radio waves — similar to the waves that carry FM radio. Your router converts data (photos, videos, websites) into a pattern of radio wave pulses and broadcasts them. Your device's antenna catches these pulses and converts them back into data. Radio waves travel at the speed of light!",
      DifficultyLevel.Medium,
      Some("/assets/images/tech/wifi.avif"), Some("/assets/animations/tech/radio-waves.json"),
      Some("/assets/audio/en/tech-002.mp3"),
      List("Wi-Fi can pass through walls because radio waves are much longer than the gaps between atoms in concrete.",
           "5G uses much higher-frequency waves that carry more data but can't pass through walls as easily."),
      List("technology","wifi","radio waves","internet"), 7, 12),

    Question("tech-003", "technology",
      "How does a camera take a photo?",
      "A camera has a lens that focuses light onto a sensor (or film). When you press the shutter button, a tiny door (the shutter) opens for a fraction of a second, letting light hit millions of tiny light-sensitive pixels. Each pixel records how much red, green, and blue light hit it. The processor combines all the readings into one image.",
      DifficultyLevel.Simple,
      Some("/assets/images/tech/camera.avif"), Some("/assets/animations/tech/camera-shutter.json"),
      Some("/assets/audio/en/tech-003.mp3"),
      List("The first photograph ever taken required an 8-hour exposure to sunlight — so people couldn't appear in early photos!",
           "A modern smartphone camera takes 12 photos at once and picks the sharpest parts from each."),
      List("technology","camera","light","photography"), 5, 12),

    Question("tech-004", "technology",
      "How does a car engine work?",
      "A petrol engine runs on controlled explosions! Fuel and air are sucked into a cylinder, compressed by a piston, then a spark plug ignites the mixture. The explosion pushes the piston down hard. This up-down motion is converted into spinning rotation by a crankshaft, which turns the wheels. Four of these explosions per cylinder happen every second at highway speed!",
      DifficultyLevel.Advanced,
      Some("/assets/images/tech/engine.avif"), Some("/assets/animations/tech/piston.json"),
      Some("/assets/audio/en/tech-004.mp3"),
      List("Electric car motors have only 20 moving parts vs. hundreds in a petrol engine — that's why they need less maintenance!",
           "The energy in one litre of petrol would lift a 1-tonne car 3,000 metres into the air if converted perfectly."),
      List("technology","cars","engines","machines"), 8, 12),

    Question("tech-005", "technology",
      "How does a computer store information?",
      "Computers store everything as billions of tiny switches that are either ON (1) or OFF (0). Every letter, photo, or video is secretly just a very long string of ones and zeros — called binary. A solid-state drive (SSD) uses microscopic cells that trap electrons to represent 1 (electrons trapped) or 0 (no electrons). Modern SSDs can hold trillions of these switches in the size of a stamp.",
      DifficultyLevel.Advanced,
      Some("/assets/images/tech/computer-storage.avif"), None,
      Some("/assets/audio/en/tech-005.mp3"),
      List("The word 'bit' stands for Binary digIT — it's the smallest unit of computer data!",
           "The entire text of every book ever written in English would take about 50 gigabytes to store — smaller than many movies."),
      List("technology","computers","binary","storage"), 9, 12)
  )

  // ── PLANTS ─────────────────────────────────────────────────
  val plants: List[Question] = List(

    Question("plants-001", "plants",
      "Why do sunflowers turn toward the Sun?",
      "Young sunflowers have a plant hormone called auxin. Auxin avoids sunlight — it accumulates on the shaded side of the stem. The shaded side with more auxin grows faster, bending the flower toward the Sun. This behaviour is called phototropism. Mature sunflowers stop moving and permanently face east to warm bees in the morning.",
      DifficultyLevel.Medium,
      Some("/assets/images/plants/sunflower.avif"), Some("/assets/animations/plants/sunflower-turn.json"),
      Some("/assets/audio/en/plants-001.mp3"),
      List("Sunflower seeds are arranged in spirals — the number of spirals are always consecutive Fibonacci numbers (21 and 34, or 34 and 55)!",
           "Sunflowers can absorb radioactive soil — they were planted near Chernobyl to help clean up contamination."),
      List("plants","sunflower","phototropism","hormones"), 6, 12),

    Question("plants-002", "plants",
      "Why do plants need sunlight?",
      "Plants are solar-powered food factories! Tiny green structures in leaves called chloroplasts use sunlight as the energy source to combine water and carbon dioxide into sugar — their food. This process, photosynthesis, also releases oxygen as a by-product. Every breath of oxygen you take came from plants or algae performing photosynthesis.",
      DifficultyLevel.Simple,
      Some("/assets/images/plants/photosynthesis.avif"), Some("/assets/animations/plants/photosynthesis.json"),
      Some("/assets/audio/en/plants-002.mp3"),
      List("A large tree produces enough oxygen in one day to supply 4 people for a day!",
           "The Amazon rainforest generates 20% of Earth's oxygen — it's often called the 'lungs of the planet'."),
      List("plants","photosynthesis","sunlight","oxygen"), 4, 12),

    Question("plants-003", "plants",
      "Why do some plants eat insects?",
      "Carnivorous plants like the Venus flytrap grow in soil so poor in nutrients (especially nitrogen) that they evolved a clever solution: they get nutrients by digesting insects instead! The Venus flytrap's 'jaw' snaps shut in under 100 milliseconds when tiny trigger hairs are touched twice — a built-in error checker to avoid false alarms.",
      DifficultyLevel.Medium,
      Some("/assets/images/plants/venus-flytrap.avif"), Some("/assets/animations/plants/flytrap-snap.json"),
      Some("/assets/audio/en/plants-003.mp3"),
      List("The Venus flytrap counts! It only snaps shut when a hair is triggered twice — to avoid wasting energy on raindrops.",
           "There are over 600 species of carnivorous plants, including ones that trap mice and small frogs."),
      List("plants","carnivorous","adaptation","insects"), 5, 12),

    Question("plants-004", "plants",
      "How do trees communicate underground?",
      "Trees are connected by a vast underground network of fungi called mycorrhizae — nicknamed the 'Wood Wide Web'. Fungi wrap around tree roots and exchange nutrients and water for the tree's sugar. Trees use this network to share food with sick neighbours, warn each other of insect attacks, and even feed their seedlings.",
      DifficultyLevel.Advanced,
      Some("/assets/images/plants/mycelium.avif"), Some("/assets/animations/plants/mycelium.json"),
      Some("/assets/audio/en/plants-004.mp3"),
      List("Mother trees — the largest trees in a forest — send the most carbon and signals through the network, especially to their own seedlings!",
           "A single teaspoon of forest soil contains several kilometres of fungal threads."),
      List("plants","fungi","trees","network","communication"), 8, 12),

    Question("plants-005", "plants",
      "Why do flowers have bright colours and sweet smells?",
      "Flowers need insects and birds to transfer pollen between plants (pollination). Bright colours and sweet smells are advertisements — 'come here and collect our free nectar!' While feeding, bees and butterflies accidentally pick up pollen and carry it to the next flower. It's a perfect deal: the insect gets food, the flower gets pollinated.",
      DifficultyLevel.Simple,
      Some("/assets/images/plants/flowers-pollination.avif"), Some("/assets/animations/plants/bee-flower.json"),
      Some("/assets/audio/en/plants-005.mp3"),
      List("Bees see ultraviolet light — flowers have hidden UV patterns invisible to us that guide bees straight to the nectar!",
           "Some flowers smell like rotting meat to attract flies — they don't need bees."),
      List("plants","flowers","pollination","insects","colour"), 4, 12)
  )

  // ── HISTORY ────────────────────────────────────────────────
  val history: List[Question] = List(

    Question("history-001", "history",
      "Why did people build the pyramids?",
      "The ancient Egyptians built pyramids as tombs for their pharaohs (kings). They believed the pharaoh's spirit (ka) needed a safe home after death to travel to the afterlife. The pyramid shape might represent the rays of the Sun reaching down from the sky. The Great Pyramid of Giza was the tallest structure on Earth for over 3,800 years!",
      DifficultyLevel.Simple,
      Some("/assets/images/history/pyramids.avif"), None,
      Some("/assets/audio/en/history-001.mp3"),
      List("The Great Pyramid contains over 2.3 million stone blocks, some weighing up to 80 tonnes!",
           "Workers who built the pyramids were not slaves — evidence shows they were well-paid skilled labourers who got free medical care."),
      List("egypt","history","pyramids","ancient"), 5, 12),

    Question("history-002", "history",
      "Why did ancient Romans build roads?",
      "Roman roads were built to move armies quickly and efficiently across their vast empire. A soldier needed to reach any trouble spot fast. The roads were also used for trade, messages (royal post), and tax collection. Roman engineers built them so well — with drainage layers and precise engineering — that some still exist 2,000 years later!",
      DifficultyLevel.Medium,
      Some("/assets/images/history/roman-road.avif"), None,
      Some("/assets/audio/en/history-002.mp3"),
      List("At its peak, the Roman road network covered over 400,000 km — enough to circle Earth 10 times!",
           "The phrase 'All roads lead to Rome' comes from the fact that Roman roads literally all connected back to Rome."),
      List("rome","history","roads","engineering"), 6, 12),

    Question("history-003", "history",
      "Why did people invent writing?",
      "Writing was invented to keep track of business! The earliest writing (cuneiform, c. 3400 BCE, in Mesopotamia/Iraq) was used to record grain deliveries, worker wages, and trade goods — like ancient spreadsheets. Writing then evolved to record laws, stories, and religious texts, making it possible to pass knowledge across generations without it being forgotten.",
      DifficultyLevel.Medium,
      Some("/assets/images/history/cuneiform.avif"), None,
      Some("/assets/audio/en/history-003.mp3"),
      List("The first known author in history is a woman — Enheduanna, a Sumerian priestess who wrote hymns around 2285 BCE.",
           "Chinese, Mayan, and Egyptian writing all developed independently — humans in different places invented the same idea!"),
      List("writing","history","ancient","language"), 7, 12),

    Question("history-004", "history",
      "Why did knights wear armour?",
      "Medieval knights needed protection from swords, arrows, and lances in battle. Armour made of steel plates could deflect slashing blows and reduce the force of impacts. Full plate armour could weigh 15–25 kg — heavy, but distributed evenly over the body so a fit knight could run, jump, and even do cartwheels in it!",
      DifficultyLevel.Simple,
      Some("/assets/images/history/knight-armour.avif"), None,
      Some("/assets/audio/en/history-004.mp3"),
      List("A suit of armour was incredibly expensive — equal to buying several houses today!",
           "Armourers used clever designs to deflect arrows — angled plates would slide the arrow tip away rather than stopping it flat-on."),
      List("knights","armour","medieval","history"), 5, 12),

    Question("history-005", "history",
      "Why did ancient Greeks hold the Olympics?",
      "The ancient Greeks held the Olympics every four years at Olympia from 776 BCE as a religious festival to honour Zeus, the king of the gods. Athletes from all Greek city-states competed — and all wars were paused during the games! Winning meant a crown of olive leaves and eternal fame, not cash prizes.",
      DifficultyLevel.Simple,
      Some("/assets/images/history/olympics.avif"), None,
      Some("/assets/audio/en/history-005.mp3"),
      List("The ancient Olympics lasted 1,200 years until a Roman emperor banned them in 393 CE!",
           "Ancient Greek athletes competed completely naked — the word 'gymnasium' comes from the Greek 'gymnos' meaning naked."),
      List("greece","olympics","history","sports"), 6, 12)
  )

  // ── FOOD ───────────────────────────────────────────────────
  val food: List[Question] = List(

    Question("food-001", "food",
      "Why does chopping onions make you cry?",
      "Onions store a sulphur compound to defend against insects and animals. When you cut an onion, you break cells and release enzymes that react with that compound to make a new gas: syn-propanethial-S-oxide. This gas floats up and dissolves in the water on your eye surface, forming a mild sulphuric acid — which your eyes try to wash away with tears!",
      DifficultyLevel.Medium,
      Some("/assets/images/food/onion-cry.avif"), Some("/assets/animations/food/onion-molecule.json"),
      Some("/assets/audio/en/food-001.mp3"),
      List("Chilling onions before cutting slows the enzyme reaction — cold onions make fewer tears!",
           "Scientists bred a 'tearless' onion in New Zealand by switching off the enzyme gene."),
      List("food","chemistry","vegetables","onion"), 6, 12),

    Question("food-002", "food",
      "Why does food taste different when you have a blocked nose?",
      "What we think of as 'taste' is actually about 80% smell! Your tongue detects only five basic tastes: sweet, salty, sour, bitter, and umami (savoury). All the complex flavours — like 'strawberry' or 'chocolate' — are actually aromas detected by your nose as you eat. Block your nose and food becomes bland and hard to identify.",
      DifficultyLevel.Medium,
      Some("/assets/images/food/taste-smell.avif"), None,
      Some("/assets/audio/en/food-002.mp3"),
      List("You can prove this: hold your nose, close your eyes, and have someone feed you apple vs. potato. Many people cannot tell the difference!",
           "Astronauts in space say food tastes bland because fluid shifts to their heads and blocks nasal passages."),
      List("food","taste","smell","senses"), 6, 12),

    Question("food-003", "food",
      "Why does chocolate taste so good?",
      "Chocolate triggers multiple pleasure systems at once! It contains sugar (activates sweet taste receptors), fat (creamy texture that feels luxurious), and dozens of compounds including theobromine (mild stimulant), phenylethylamine (a feel-good chemical), and compounds that slow the breakdown of anandamide — the brain's natural 'bliss molecule'.",
      DifficultyLevel.Advanced,
      Some("/assets/images/food/chocolate.avif"), Some("/assets/animations/food/chocolate-melt.json"),
      Some("/assets/audio/en/food-003.mp3"),
      List("Chocolate melts at exactly body temperature (34°C) — that's why it melts in your mouth so perfectly!",
           "It takes 400 cocoa beans — from 10 cocoa trees — to make just 450g of chocolate."),
      List("food","chocolate","chemistry","brain"), 7, 12),

    Question("food-004", "food",
      "Why does bread go mouldy?",
      "Mould spores are floating in the air all around you — tiny, invisible reproductive particles. When they land on bread, they find perfect conditions: carbohydrates for food, moisture, and warmth. The spore germinates, grows thread-like roots into the bread, and reproduces by making more spores. The fuzzy green/white stuff you see is millions of spore-producing structures.",
      DifficultyLevel.Simple,
      Some("/assets/images/food/mouldy-bread.avif"), None,
      Some("/assets/audio/en/food-004.mp3"),
      List("Penicillin — the world's first antibiotic — was discovered when Alexander Fleming noticed mould killing bacteria on a forgotten petri dish!",
           "Keeping bread in the fridge slows but doesn't stop mould — mould just grows more slowly in the cold."),
      List("food","mould","biology","fungi"), 5, 12),

    Question("food-005", "food",
      "Why do we cook food?",
      "Cooking does several amazing things: heat kills harmful bacteria and parasites, making food safe to eat. It breaks down tough plant and animal tissues so our bodies can extract more energy and nutrients. It also triggers hundreds of chemical reactions (like the Maillard reaction) that create flavours and smells never present in raw food.",
      DifficultyLevel.Medium,
      Some("/assets/images/food/cooking.avif"), Some("/assets/animations/food/maillard.json"),
      Some("/assets/audio/en/food-005.mp3"),
      List("The Maillard reaction — the browning that happens when bread toasts or meat sears — creates over 600 different flavour compounds!",
           "Cooking may have made humans: soft, calorie-rich cooked food allowed our brains to grow bigger over evolution."),
      List("food","cooking","chemistry","biology"), 6, 12)
  )

  val all: List[Question] = technology ++ plants ++ history ++ food
}
