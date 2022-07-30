package com.dicoding.submissionaplikasiandroidsederhana

object NovelData {
    private val novelJudul = arrayOf(
        "Lord of the Mysteries",
        "Trash of the Count’s Family",
        "Return of the Mount Hua Sect",
        "Warlock of the Magus World",
        "Questioning Heaven, Desiring the Way",
        "Overgeared",
        "Omniscient Reader’s Viewpoint",
        "Nano Machine",
        "The World After the Fall",
        "SSS-Class Suicide Hunter"
    )

    private val novelNegara = arrayOf(
        "China",
        "Korea",
        "Korea",
        "China",
        "China",
        "Korea",
        "Korea",
        "Korea",
        "Korea",
        "Korea"
    )

    private val novelGambarSampul = intArrayOf(
        R.drawable.lotm,
        R.drawable.trash,
        R.drawable.returnmount,
        R.drawable.warlock,
        R.drawable.quest,
        R.drawable.over,
        R.drawable.orv,
        R.drawable.nanomachine,
        R.drawable.theworldafterthefall,
        R.drawable.sss
    )

    private val novelGenre = arrayOf(
        "Action Comedy Fantasy Horror Mature Mystery Psychological Supernatural Xuanhuan",
        "Action Adventure Comedy Drama Fantasy Mystery Seinen",
        "Action Adventure Comedy Fantasy Martial Arts Wuxia",
        "Adventure Martial Arts Mature Sci-fi Seinen Xuanhuan",
        "Action Adventure Psychological Xianxia",
        "Action Adventure Comedy Fantasy Harem",
        "Action Adventure Drama Fantasy Mature Mystery Psychological Sci-fi Seinen Supernatural",
        "Action Adventure Drama Fantasy Mature Mystery Psychological Sci-fi Seinen Supernatural",
        "Action Adventure Drama Fantasy Mystery Shounen",
        "Action Adventure Comedy Fantasy Martial Arts Tragedy"
    )

    private val novelYear = arrayOf(
        "2018",
        "2017",
        "2019",
        "2015",
        "2017",
        "2014",
        "2018",
        "2017",
        "2016",
        "2018"
    )

    private val novelAuthor = arrayOf(
        "Cuttlefish That Loves Diving(爱潜水的乌贼)",
        "Yu Ryeo Han(유려한)",
        "Biga(비가)",
        "The Plagiarist(文抄公)",
        "Fog Is Not Snow(雾非雪)",
        "Park Saenal",
        "Sing-Shong(싱숑)",
        "Han-Joong-Wueol-Ya",
        "Sing-Shong(싱숑)",
        "Shin Noah(신노아)",
    )

    private val novelDescription = arrayOf(
        "With the rising tide of steam power and machinery, who can come close to being a Beyonder? Shrouded in the fog of history and darkness, who or what is the lurking evil that murmurs into our ears?\n" +
                "\n" +
                "Waking up to be faced with a string of mysteries, Zhou Mingrui finds himself reincarnated as Klein Moretti in an alternate Victorian era world where he sees a world filled with machinery, cannons, dreadnoughts, airships, difference machines, as well as Potions, Divination, Hexes, Tarot Cards, Sealed Artifacts…\n" +
                "\n" +
                "The Light continues to shine but mystery has never gone far. Follow Klein as he finds himself entangled with the Churches of the world—both orthodox and unorthodox—while he slowly develops newfound powers thanks to the Beyonder potions.\n" +
                "\n" +
                "Like the corresponding tarot card, The Fool, which is numbered 0—a number of unlimited potential—this is the legend of “The Fool”.",

        "When I opened my eyes, I was inside a novel.\n" +
                "\n" +
                "[The Birth of a Hero].\n" +
                "[The Birth of a Hero] was a novel focused on the adventures of the main character, Choi Han, a high school boy who was transported to a different dimension from Earth, along with the birth of the numerous heroes of the continent.\n" +
                "I became a part of that novel as the tr*sh of the Count’s family, the family that oversaw the territory where the first village that Choi Han visits is located.\n" +
                "\n" +
                "The problem is that Choi Han becomes twisted after that village, and everyone in it, is destroyed by assassins.\n" +
                "\n" +
                "The bigger problem is the fact that this s*upid tr*sh who I’ve become doesn’t know about what happened in the village and messes with Choi Han, only to get beaten to a pulp.\n" +
                "\n" +
                "“…This is going to be a problem.”\n" +
                "\n" +
                "I feel like something serious has happened to me.\n" +
                "\n" +
                "But it was worth trying to make this my new life.",

        "The 13th disciple of the Great Mount Hua Sect. One of the Greatest Third-Generation Swordsmen. The Plum Blossom Sword Master, Chungmyung.\n" +
                "\n" +
                "After slicing the head of the peerless Heavenly Demon, who threw the world into chaos, he slept an eternal sleep on the peak of the Hundred Thousand Great Mountains. Jumping over a hundred years, he comes back in the body of a child.\n" +
                "\n" +
                "But… what? Mount Hua declined? What the hell are you talking about!?\n" +
                "\n" +
                "It’s only natural to want to live if you’re going broke.\n" +
                "\n" +
                "“Decline? Even though I’m here? Who would dare!”\n" +
                "\n" +
                "Plum blossoms eventually fall.\n" +
                "\n" +
                "But when the cold winter passes and spring comes, plum blossoms shall bloom again.\n" +
                "\n" +
                "“But I’m gonna die first before Mount Hua gets revived! If you’re gonna go bust, might as well do it right, you bastards!”\n" +
                "\n" +
                "The beginning of the Plum Blossom Sword Master, Chungmyung’s solitary struggle to save the thoroughly declining Mount Hua Sect.",

        "When a futuristic scientist is transported into the body of a young man in a fantasy world, his curiosity and desire for power push him to pursue magic. In a world without mercy, Leylin has no qualms about doing anything if it means benefits. He is cold, ruthless and calculating, never forming attachments that could impede his ultimate goal…\n" +
                "\n" +
                "Honor? Who needs that… Hmmm… that guy seems too powerful for me to take on now… I better keep a low profile for now.\n" +
                "\n" +
                "You want me to help you? What do I get out of it? Nothing? Bye.\n" +
                "\n" +
                "Hmm… that guy looks like he might cause me problems in the future. Better kill him before he becomes a problem…",

        "A piece of animal hide made him give up becoming an immortal.\n" +
                "Millions had to die just for him to catch a glimpse of the Way of Heaven.\n" +
                "\n" +
                "The Earth shattered just as it was formed\n" +
                "Immortals and demons disappeared\n" +
                "The age old tale of Nuwa creating mankind\n" +
                "Is this the revolt of his predecessors or a scheme of the Way of Heaven?\n" +
                "\n" +
                "He does not cultivate for the sake of becoming an immortal or for the sake of longevity.\n" +
                "\n" +
                "He only wants to know the answer to one question: What lies above the Way?",

        "As Shin Youngwoo had an unfortunate life and is now stuck carrying bricks on construction sites. He even had to do labor in the most popular VR game, Satisfy!\n" +
                "\n" +
                "However, luck would soon enter his hopeless life. His character, ‘Grid’, would discover the Northern End Cave for a quest, and in that place, he would find ‘Pagma’s Rare Book’ and will become a legend…",

        "Kim Dokja does not consider himself the protagonist of his own life. Befitting the name his parents gave him, he is a solitary person whose sole hobby is reading web novels. For over a decade, he has lived vicariously through Yu Junghyeok, the main character of the web novel Three Ways to Survive the Apocalypse (TWSA).\n" +
                "\n" +
                "Through Junghyeok, Dokja has experienced secondhand the trials of repeatedly regressing in time, in search of an end to life-threatening “scenarios” that force people to act out narratives for the amusement of god-like “Constellations.”\n" +
                "\n" +
                "After reading 3,149 chapters—long after all other readers lost interest—Dokja finally resigns himself to the story ending. However, he receives an enigmatic message from the author, stating that the story will soon be monetized, before his surroundings suddenly go dark.\n" +
                "\n" +
                "He swiftly realizes that fiction has become reality and he is now living through TWSA. Although he is the singular omniscient reader of the events yet to come, his success in the scenarios is not guaranteed—but perhaps his advantage will empower him to step into the protagonist role that never suited him before.",

        "Until he became the lowest-ranked master, his lonely and luckless life never changed.\n" +
                "\n" +
                "Suddenly one day, a descendant injected him with a nanomachine, and the machine started ‘speaking’ to him.\n" +
                "\n" +
                "[I am the seventh generation Nanomachine manufactured by Sky Cooperation, and I am operating as a central nerve connected to your brain.]\n" +
                "“What? What are you talking about?”\n" +
                "\n" +
                "This was beyond the boy’s knowledge, he turned pale.\n" +
                "\n" +
                "The Nanomachine linked to his cerebrum realized the User was not understanding a single word it said.\n" +
                "\n" +
                "“Who are you, and why are you doing this to me?”\n" +
                "\n" +
                "[“I am the seventh generation Nanomachine.]\n" +
                "“Nano Machine?”\n" +
                "\n" +
                "[Yes, Nanomachine.]\n" +
                "The boy’s face hardened.\n" +
                "\n" +
                "Mashin was the deity the Mashin Religion worshipped, along with the Sacred Fire.\n" +
                "\n" +
                "The religions’ Master communicated with Mashin.\n" +
                "\n" +
                "“Um, are you really Mashin?”\n" +
                "\n" +
                "The boy knelt down and asked with a trembling voice. At this, the Nanomachine attached to his cerebrum realized it had been misunderstood.",

        "One day, a tower appeared in the skies of all the major cities…\n" +
                "Humans were suddenly summoned to become “Walkers”, and they needed to clear the tower to save the world.\n" +
                "\n" +
                "Floor 77:\n" +
                "\n" +
                "The “Stone of Regression” was discovered. Walkers could now “return” to the past. Slowly… everyone left.\n" +
                "\n" +
                "Humanity’s last hope, “Carpe Diem”, was formed, joined by people who refused to abandon the world.\n" +
                "\n" +
                "The last Walker reached floor 100. He no longer knew what to believe.",

        "I want an S-Rank skill too! I want it so badly, I could die for it!\n" +
                "\n" +
                "[You have awakened an S-Rank skill.] [But it only works when you die.]\n" +
                "Eh !? WHAT IS THE POINT OF GETTING ONE IF I DIE !?"
    )

    val listData: ArrayList<Novel>
        get() {
            val list = arrayListOf<Novel>()
            for (position in novelJudul.indices) {
                val novel = Novel()
                novel.judul = novelJudul[position]
                novel.negara = novelNegara[position]
                novel.genre = novelGenre[position]
                novel.photo = novelGambarSampul[position]
                novel.year = novelYear[position]
                novel.author = novelAuthor[position]
                novel.description = novelDescription[position]
                list.add(novel)
            }
            return list
        }
}