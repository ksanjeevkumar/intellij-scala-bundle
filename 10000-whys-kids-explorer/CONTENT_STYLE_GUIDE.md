# 10,000 Whys – Content Style Guide

Based on the physical *100,000 Whys* book aesthetic and adapted for the digital app.

---

## Visual Design Language

### Color System

| Role | Color | Hex | Usage |
|---|---|---|---|
| Page background | Cream | `#FFF8EA` | Screen backgrounds |
| Card background | White | `#FFFFFF` | Answer cards, book pages |
| Navy | Dark navy | `#1B2045` | Headers, answer labels, cover |
| Orange | Brand orange | `#F4821A` | Question marks, CTAs, "Why" word |
| Gold | Warm gold | `#F5C518` | Stars, accent, nav active state |
| Green highlight | Mint green | `#D6F5E6` | Key terms in answers |
| Yellow highlight | Warm yellow | `#FFF3B0` | Scientific names, vocabulary |
| Orange highlight | Soft orange | `#FFF0DC` | Emphasis words |

### Typography

| Element | Font | Size | Weight | Style |
|---|---|---|---|---|
| "Why" word | Caveat (cursive) | 26–42px | 700 | Italic, orange |
| Question text | Nunito | 17–20px | 900 | Upright, navy |
| Answer body | Nunito | 14–15px | 400 | Line-height 1.8 |
| Category name | Nunito | 10–12px | 800 | All-caps |
| Fun fact | Nunito | 13px | 400 | With ⭐ prefix |
| Section header | Nunito | 16px | 900 | With orange left-border |

### Decorative Elements (from the book)

- **Orange `?` mark** — always follows the question title, slightly larger than body text, `color: #F4821A`
- **Gold stars `⭐`** along a dashed line — used as dividers between sections
- **Lined notebook background** — repeating horizontal lines `#E8DFC8` every 28px
- **3px solid drop shadows** on cards — `box-shadow: 3px 3px 0 #D0C5B0`
- **Dashed borders** between sections — `border: 2px dashed #E0D5C0`
- **Answer highlighted spans** — never underline, always background-color highlight

---

## Writing Rules

### Question Format

```
Why do [subject] [verb]?
Why is [thing] [adjective]?
How does [thing] [verb]?
```

- Always start with **Why**, **How**, or **What** — never "Did you know"
- Question text in the UI is split: `Why` (italic orange) + `do astronauts float in space?` (bold navy)
- Max 12 words in the question

### Answer Format — 3-Part Structure

```
[1] Hook — 1 sentence that directly answers the question in simple terms
[2] Mechanism — 2–3 sentences explaining HOW it works, using an analogy
[3] Punchline — 1 memorable sentence that makes it stick
```

**Example (Why do elephants have big ears?):**
> Elephants use their enormous ears like fans and radiators. [Hook]
> Blood flows through the thin skin of their ears, cools down in the air,
> and goes back into their body. The ears radiate heat exactly like the
> cooling fins on a motorbike engine. [Mechanism]
> It's a built-in air conditioner! [Punchline]

### Vocabulary Rules by Age Tier

| Age Tier | Max syllables | Technical terms | Analogy required? |
|---|---|---|---|
| Simple (4–6) | 2 syllables | No | Yes — always |
| Medium (7–9) | 3 syllables | Introduce with definition | Yes |
| Advanced (10–12) | Any | Scientific names allowed | Encouraged |

### Highlighting Rules

Apply inline HTML highlights in answers:

| `class` | What to highlight | Example |
|---|---|---|
| `hl-green` | Key process / answer word | `free fall`, `photosynthesis` |
| `hl-yellow` | Scientific name / vocab | `microgravity`, `auxin` |
| `hl-orange` | Structure / organ / tool | `larynx muscles`, `chloroplasts` |

Never highlight more than **3 spans** per answer. Never highlight full sentences.

### Fun Facts — Rules

- Exactly **2 fun facts** per question
- Format: surprising, specific, child-delight trigger
- Structure: `[SUPERLATIVE or CONTRAST] — [specific fact with number if possible]`
- Never repeat information already in the answer
- At least one fact should be a world-record/comparison kids can visualise

**Good:** `A cat's purr vibrates between 25 and 150 Hz — the same range that can heal bones!`  
**Bad:** `Cats purr when they are happy.` (repeats answer, not surprising)

---

## Content Quality Checklist

Before publishing any question, verify:

- [ ] Answer uses the 3-part structure (Hook → Mechanism → Punchline)
- [ ] At least one real-world analogy present
- [ ] 2 fun facts, both surprising and specific
- [ ] No more than 3 highlighted spans in the answer
- [ ] Age range set correctly (ageMin / ageMax on `Question` model)
- [ ] Tags include category, subject matter, and 1–2 keywords
- [ ] Audio narration script written (matches answer text exactly)
- [ ] Image URL and animation URL referenced (or marked TODO)
- [ ] Difficulty level matches vocabulary and concept complexity

---

## Difficulty Calibration Examples

| Difficulty | Example Question | Why |
|---|---|---|
| Simple | Why do dogs wag their tails? | Familiar subject, simple mechanism, no jargon |
| Simple | Why does ice float on water? | Counter-intuitive but explainable without chemistry |
| Medium | Why do elephants have big ears? | Requires understanding of body temperature regulation |
| Medium | Why does bread rise? | Introduces yeast/biology but relatable context |
| Advanced | Why do octopuses have 3 hearts? | Multiple systems, copper-based blood, evolutionary context |
| Advanced | Why is space completely dark (Olbers' Paradox)? | Cosmology, requires age-of-universe concept |

---

## Category Mascots & Tones

| Category | Mascot | Tone | Signature analogy style |
|---|---|---|---|
| Animals | Ollie the Owl | Warm, adventurous | Comparisons to human behaviour |
| Space | Nova the Rocket | Wonder, scale | "Imagine if…" scale comparisons |
| Human Body | Bodie the Robot | Playful, precise | Body as machine / factory |
| Earth & Nature | Terra the Leaf | Calm, poetic | Nature cycles, home planet pride |
| Everyday Science | Sparky the Bulb | Energetic, curious | Kitchen / home experiments |
| Technology | Gizmo the Gear | Logical, clear | Step-by-step machine analogies |
| Plants | Fern the Sprout | Gentle, surprising | Secret lives of plants |
| History | Chrono the Scroll | Storytelling, dramatic | "Can you imagine living when…?" |
| Food & Daily Life | Yumi the Chef | Warm, relatable | Cooking chemistry |

---

## Audio Narration Script Rules

- Match answer text exactly (no paraphrasing)
- Narrator reads highlighted terms with **slight emphasis** (longer pause after)
- Fun facts use a different, slightly excited tone
- Total narration target: **30–60 seconds** per question at normal speed
- Slow mode: same script at 0.75× playback, not re-recorded
- File naming: `/assets/audio/{lang}/{questionId}.mp3`
