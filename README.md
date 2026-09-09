<img src="https://i.ibb.co.com/7NrtB6Vv/image.png" />

# Forkathon 2026: **KUET Kinship** by **KUET_Titanium**

> Built for ForkedArch Freshers Hackathon 2026

## 👥 Team

| Name     | Roll     | Department | GitHub    |
| -------- | -------- | ---------- | --------- |
| Muhammad Tahmid Ahnaf | 52507086 | CSE        | @builtbyahnaf |
| Mobasshira Sadia Sakal (Mira) | 52507041 | CSE        | @mira1423 |
| Tahsin Hossain Chowdhury | 52507094 | CSE        | @tahsinlog2k25 |

---

## ❔ Problem

### Problem Statement

> The Student Who Knows Everything

Every campus has that one person.

They know which teacher prefers handwritten assignments. They know where to find a particular lab component. They know which form needs three signatures. They know which shortcut gets you to the library faster.

Ask the senior anything,

"Where do I submit this form?"
"Which room is the lab in?"
"Where can I find the previous question papers?"
"Who do I contact about this?"

they are the ultimate solution.

But one day, they graduate.

Suddenly, years of tiny pieces of useful knowledge disappear with them.

Why not building a system that captures, organizes, verifies, and passes useful community knowledge from one generation of users to another.
The information could relate to academic life, campus facilities, procedures, resources, tips, locations, events, or anything else that people repeatedly need to figure out.

Brainstorming twist:
Your system should somehow deal with the fact that not all knowledge is equally reliable, current, or useful.

### 🤔 KUET_Titanium's Understanding

It’s a regular Sunday morning at the KUET CSE department. Ahnaf is rushing down the corridor holding an
unorganized stack of clearance forms, completely confused about which room to submit them to or who needs to
sign them first. At the same time, Mira is hunting for a specific hardware module for her project that isn't available
in the central store, while Tahsin is frantically asking around for previous semester question papers that seem to
have disappeared online.
Just as frustration sets in, a familiar senior walks past, smiles, and clears up the entire mess in under two
minutes:
- 📍 **Ahnaf:** "Take that to Room 302, but make sure the Assistant Registrar signs it before 11 AM."
- 📍 **Mira:** "Check the bottom-back drawer in CSE Lab 2; the previous batch left extra components there."
- 📍 **Tahsin:** "Stop digging through dead Google Drive links—just ask the library assistant on the 2nd floor for
the archived folder."

Just like that, confusion turns into absolute clarity. Every campus has those go-to seniors who essentially hold the
unofficial "user manual" to university life in their heads.

**The Dilemma:** But then comes graduation day. The seniors toss their caps, leave campus, and take years
of hard-earned shortcuts, procedural tricks, and practical wisdom right out the gate. The very next term, the
new batch is forced to start back at square one, repeating the same struggles all over again.

# ❓ **What is the actual problem?**
It’s a classic case of institutional amnesia. Crucial operational knowledge on a campus rarely lives on official websites
or handbooks—it lives inside people's heads. Without a structured way to pass this wisdom down, valuable campus
hacks and practical guidelines vanish with every graduation cycle.

# 👥 **Who experiences it?**
**Students (Especially Freshers & Juniors)**: 
They waste endless hours, energy, and sanity
navigating basic campus bureaucracy, finding
obscure resources, or figuring out how things actually
work.

**Faculty & Staff**:
They end up answering the same repetitive
procedural questions dozens of times every single
semester because students have nowhere else to
check.

# 💡 **Why does it matter?**
- **Wasted Energy:** Students spend critical time solving administrative riddles instead of building projects, studying,
and innovating.
- **The "Inefficiency Tax":** Every new generation pays the price of making the same avoidable mistakes simply
because past learnings were never preserved.
- **Misinformation Trap:** When advice is passed down informally through random chat groups, it quickly becomes
outdated, inaccurate, or completely misleading.

---

## 💡 Our Solution

### Overview

To permanently end this cycle of lost knowledge, **KUET_Titanium** is building an offline-first Android application powered by an embedded SQLite database that acts as a living, evolving memory for the campus community — a system where practical knowledge is captured once, verified by the community, and passed down to every new batch automatically. It serves as a permanent, searchable campus repository that works anytime, anywhere—even without internet connectivity.



# Core Objectives

* 📶 **Offline-First Android App:** Works seamlessly without an internet connection (inside thick lab walls, underground rooms, or low-signal campus areas).Automatically syncs new contributions whenever connectivity is restored.
  
* 🗂️ **Flexible Knowledge Database:** Accommodates diverse data formats — locations, contacts, warnings, document requirements, and procedural steps. Built on a schema that handles flexible data types without forcing them into a rigid structure.
  
* 🔍 **Searchable Knowledge Chunks:** Information is stored as bite-sized, self-contained, tagged entries rather than long, unstructured posts.Enables high-precision search to return exact answers instantly.
  
* 🗺️ **Guided Step-by-Step Roadmaps:** Complex processes (e.g., getting a form signed, applying for a re-exam, course registration) are laid out as clear, sequential steps ($1 \rightarrow 2 \rightarrow 3$).
  
* ⏳ **Data Validation & Lifespan:** Every entry tracks a freshness and validity status.Automatically flags aging entries and allows community re-verification so outdated information loses trust over time.
  
* 🏆 **Contribution Scores & Levels:** Tracks contributor accuracy through community verification. Users earn trust scores and level tiers, ensuring high-integrity contributors carry more weight than unverified sources.

In short: We are building a trust-aware, self-updating memory for the campus — ensuring that when the senior who knows everything graduates, everything they knew stays behind.


### How It Works

Explain the complete flow of your system.

1.
2.
3.

---

## 🏗️ Architecture

Add your architecture diagram here.
Demo diagram added down below

```text
User
  │
  ▼
Frontend
  │
  ▼
Backend / API
  │
  ├── Database
  │
  └── External Services
```

<b>Forkathon: Freshers Hackathon 2026 presented by ForkedArch powered by XtendArena</b>
