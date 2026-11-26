November 17, 2026 (Stage 1)

Completed:
- Created the GitHub repository.
- Added the console welcome screen and main menu with New Game and Exit choices.
- Added the Expedition and ResultStore class structures.

November 20, 2026
- Completed:
- Initialized the Expedition game-state fields.

Known problems:
- Map generation and playable gameplay are not implemented yet. These are planned for Stage 2.

Design decision:
- Expedition stores the map and game-state fields. Main handles console interaction.

Assistance:
- No AI assistance was used.

November 25, 2026 (Stage 2)

Completed:
- Implemented basic 2D map generation (5x5 to 12x12). This will be completed.
- Added getter methods to Expedition.

Known problems:
- Stage 2 is not fully completed yet.

Design decision:
- Used a private helper method (placeRandomTile) inside Expedition to avoid code duplication when placing relics, hazards, exit, and supply cache on distinct non-starting cells.

Assistance:
- AI assistance (Gemini, Google LLC) was used to check the differences between System.currentTimeMillis() and System.nanoTime(). 
- AI assistance (Gemini, Google LLC) was used to check if using System.currentTimeMillis() as an argument in Random() necessary.
- PDF is included in /docs.

November 26, 2026 (Stage 2)

Completed:
- Placed random tiles.
- Added getMap() method.
- Fixed grammatical error in README.md and completed Build & Run instructions.

Known problems:
- Stage 2 is not fully completed yet.
- ResultStore.java is still empty.
- renderMap() and move() methods are not ready.

Design decision:
- Used arrayCopy to copy the map instead of returning the original one.

Assistance:
- No AI assistance was used. 