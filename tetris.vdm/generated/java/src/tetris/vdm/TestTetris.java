package tetris.vdm;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class TestTetris extends TestCaseExtra {
  private String printBoard = "";

  private void initalMatrix_test(
      final Game game,
      final Boolean printNow,
      final Boolean blackConsole,
      final Boolean testPrint) {

    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertEqual(
        printBoard,
        "\n▕          ▏"
            + "\n▕          ▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n ▔▔▔▔▔▔▔▔▔▔");
  }

  private void addTetramino1_test(
      final Game game,
      final Boolean printNow,
      final Boolean blackConsole,
      final Boolean testPrint) {

    game.newTetramino(1L);
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertEqual(
        printBoard,
        "\n▕          ▏"
            + "\n▕   ████   ▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n ▔▔▔▔▔▔▔▔▔▔");
  }

  private void addTetramino2_test(
      final Game game,
      final Boolean printNow,
      final Boolean blackConsole,
      final Boolean testPrint) {

    game.newTetramino(2L);
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertEqual(
        printBoard,
        "\n▕   █      ▏"
            + "\n▕   ███    ▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░████░░░▏"
            + "\n ▔▔▔▔▔▔▔▔▔▔");
  }

  private void addTetramino3_test(
      final Game game,
      final Boolean printNow,
      final Boolean blackConsole,
      final Boolean testPrint) {

    game.newTetramino(3L);
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertEqual(
        printBoard,
        "\n▕     █    ▏"
            + "\n▕   ███    ▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕█░░░░░░░░░▏"
            + "\n▕███████░░░▏"
            + "\n ▔▔▔▔▔▔▔▔▔▔");
  }

  private void addTetramino4_test(
      final Game game,
      final Boolean printNow,
      final Boolean blackConsole,
      final Boolean testPrint) {

    game.newTetramino(4L);
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertEqual(
        printBoard,
        "\n▕    ██    ▏"
            + "\n▕    ██    ▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕█░░░░░░░░█▏"
            + "\n ▔▔▔▔▔▔▔▔▔▔");
  }

  private void addTetramino5_test(
      final Game game,
      final Boolean printNow,
      final Boolean blackConsole,
      final Boolean testPrint) {

    game.newTetramino(5L);
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertEqual(
        printBoard,
        "\n▕    ██    ▏"
            + "\n▕   ██     ▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░██░░░░▏"
            + "\n▕█░░░██░░░█▏"
            + "\n ▔▔▔▔▔▔▔▔▔▔");
  }

  private void addTetramino6_test(
      final Game game,
      final Boolean printNow,
      final Boolean blackConsole,
      final Boolean testPrint) {

    game.newTetramino(6L);
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertEqual(
        printBoard,
        "\n▕    █     ▏"
            + "\n▕   ███    ▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░██░░██▏"
            + "\n▕█░░░██░███▏"
            + "\n ▔▔▔▔▔▔▔▔▔▔");
  }

  private void addTetramino7_test(
      final Game game,
      final Boolean printNow,
      final Boolean blackConsole,
      final Boolean testPrint) {

    game.newTetramino(7L);
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertEqual(
        printBoard,
        "\n▕   ██     ▏"
            + "\n▕    ██    ▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░█░░░▏"
            + "\n▕░░░░██████▏"
            + "\n▕█░░░██████▏"
            + "\n ▔▔▔▔▔▔▔▔▔▔");
  }

  private void addTetramino8_test(
      final Game game,
      final Boolean printNow,
      final Boolean blackConsole,
      final Boolean testPrint) {

    game.newTetramino(5L);
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertEqual(
        printBoard,
        "\n▕    ██    ▏"
            + "\n▕   ██     ▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░░░░░▏"
            + "\n▕░░░░░░█░░░▏"
            + "\n▕██░░██████▏"
            + "\n▕███░██████▏"
            + "\n ▔▔▔▔▔▔▔▔▔▔");
  }

  private void moveTetramino1_test(
      final Game game,
      final Boolean printNow,
      final Boolean blackConsole,
      final Boolean testPrint) {

    assertTrue(game.down());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertTrue(game.down());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertTrue(game.rotate());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertTrue(game.rotate());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertTrue(game.rotate());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertTrue(game.rotate());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertEqual(game.drop(), 18L);
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertEqual(game.getScore(), 18L);
    assertEqual(game.checkLines(), 0L);
  }

  private void moveTetramino2_test(
      final Game game,
      final Boolean printNow,
      final Boolean blackConsole,
      final Boolean testPrint) {

    assertTrue(game.down());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertTrue(game.down());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertTrue(game.rotate());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertTrue(game.rotate());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertTrue(game.rotate());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertTrue(game.rotate());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertTrue(game.left());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertTrue(game.left());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertTrue(game.left());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertEqual(game.drop(), 18L);
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertEqual(game.getScore(), 36L);
    assertEqual(game.checkLines(), 0L);
  }

  private void moveTetramino3_test(
      final Game game,
      final Boolean printNow,
      final Boolean blackConsole,
      final Boolean testPrint) {

    assertTrue(game.down());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertTrue(game.down());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertTrue(game.rotate());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertTrue(game.rotate());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertTrue(game.rotate());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertTrue(game.rotate());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertTrue(game.right());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertTrue(game.right());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertTrue(game.right());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertTrue(game.right());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertEqual(game.drop(), 18L);
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertEqual(game.getScore(), 54L);
    assertEqual(game.checkLines(), 1L);
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertEqual(game.getScore(), 154L);
  }

  private void moveTetramino4_test(
      final Game game,
      final Boolean printNow,
      final Boolean blackConsole,
      final Boolean testPrint) {

    assertTrue(game.down());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertTrue(game.down());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertTrue(game.rotate());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertTrue(game.rotate());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertTrue(game.rotate());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertTrue(game.rotate());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertEqual(game.drop(), 18L);
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertEqual(game.getScore(), 172L);
    assertEqual(game.checkLines(), 0L);
  }

  private void moveTetramino5_test(
      final Game game,
      final Boolean printNow,
      final Boolean blackConsole,
      final Boolean testPrint) {

    assertTrue(game.down());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertTrue(game.down());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertTrue(game.rotate());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertTrue(game.rotate());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertTrue(game.rotate());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertTrue(game.rotate());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertTrue(game.right());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertTrue(game.right());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertTrue(game.right());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertTrue(game.right());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertEqual(game.drop(), 18L);
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertEqual(game.getScore(), 190L);
    assertEqual(game.checkLines(), 0L);
  }

  private void moveTetramino6_test(
      final Game game,
      final Boolean printNow,
      final Boolean blackConsole,
      final Boolean testPrint) {

    assertTrue(game.down());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertTrue(game.down());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertTrue(game.rotate());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertTrue(game.rotate());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertTrue(game.rotate());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertTrue(game.rotate());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertTrue(game.rotate());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertTrue(game.right());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertTrue(game.right());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertEqual(game.drop(), 17L);
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertEqual(game.getScore(), 207L);
    assertEqual(game.checkLines(), 0L);
  }

  private void moveTetramino7_test(
      final Game game,
      final Boolean printNow,
      final Boolean blackConsole,
      final Boolean testPrint) {

    assertTrue(game.down());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertTrue(game.down());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertTrue(game.rotate());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertTrue(game.rotate());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertTrue(game.rotate());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertTrue(game.rotate());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertTrue(game.left());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertTrue(game.left());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertTrue(game.left());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertEqual(game.drop(), 18L);
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertEqual(game.getScore(), 225L);
    assertEqual(game.checkLines(), 0L);
  }

  private void moveTetramino8_test(
      final Game game,
      final Boolean printNow,
      final Boolean blackConsole,
      final Boolean testPrint) {

    assertTrue(game.down());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertTrue(game.down());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertTrue(game.rotate());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertTrue(game.left());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertTrue(game.left());
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertEqual(game.drop(), 17L);
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertEqual(game.getScore(), 242L);
    assertEqual(game.checkLines(), 2L);
    printBoard = game.printBoard(printNow, blackConsole, testPrint);
    assertEqual(game.getScore(), 542L);
  }

  private void play_test(
      final Game game,
      final Boolean printNow,
      final Boolean blackConsole,
      final Boolean testPrint) {

    Number column = 0L;
    long toVar_10 = 40L;

    for (Long i = 1L; i <= toVar_10; i++) {
      game.newTetramino(1L);
      assertTrue(game.down());
      printBoard = game.printBoard(printNow, blackConsole, testPrint);
      assertTrue(game.down());
      printBoard = game.printBoard(printNow, blackConsole, testPrint);
      assertTrue(game.rotate());
      printBoard = game.printBoard(printNow, blackConsole, testPrint);
      Boolean whileCond_1 = true;
      while (whileCond_1) {
        whileCond_1 = game.left();
        if (!(whileCond_1)) {
          break;
        }

        printBoard = game.printBoard(printNow, blackConsole, testPrint);
      }

      long toVar_9 = column.longValue();

      for (Long j = 1L; j <= toVar_9; j++) {
        if (game.right()) {
          printBoard = game.printBoard(printNow, blackConsole, testPrint);
        }
      }
      Boolean orResult_1 = false;

      if (Utils.equals(column, 2L)) {
        orResult_1 = true;
      } else {
        orResult_1 = Utils.equals(column, 6L);
      }

      if (orResult_1) {
        assertEqual(game.drop(), 15L);
      } else {
        assertEqual(game.drop(), 16L);
      }

      printBoard = game.printBoard(printNow, blackConsole, testPrint);
      if (Utils.equals(column, 9L)) {
        assertEqual(game.checkLines(), 4L);
        printBoard = game.printBoard(true, true, true);

      } else {
        assertEqual(game.checkLines(), 0L);
      }

      column = Utils.mod(column.longValue() + 1L, 10L);
      if (Utils.equals(i, 20L)) {
        assertEqual(game.getLines(), 11L);
        assertEqual(game.getLevel(), 2L);
        assertEqual(game.getScore(), 542L + 16L * 16L + 15L * 4L + 800L * 2L);
      }
    }
    assertEqual(game.getLines(), 19L);
    assertEqual(game.getLevel(), 2L);
    assertEqual(game.getScore(), 2458L + 16L * 16L * 2L + 15L * 4L * 2L + 800L * 2L * 2L);
  }

  private void gameOver_test(
      final Game game,
      final Boolean printNow,
      final Boolean blackConsole,
      final Boolean testPrint) {

    Boolean whileCond_2 = true;
    while (whileCond_2) {
      whileCond_2 = !(game.getGameOver());
      if (!(whileCond_2)) {
        break;
      }

      {
        game.newRandomTetramino();
        printBoard = game.printBoard(printNow, blackConsole, testPrint);
        if (game.drop().longValue() > 0L) {
          printBoard = game.printBoard(printNow, blackConsole, testPrint);
        }

        if (game.checkLines().longValue() > 0L) {
          printBoard = game.printBoard(printNow, blackConsole, testPrint);
        }
      }
    }

    assertTrue(game.getGameOver());
  }

  public static void main(
      final Boolean printNow, final Boolean blackConsole, final Boolean testPrint) {

    Game game = new Game();
    IO.print("\n##### TESTS #####\n");
    new TestTetris().initalMatrix_test(game, printNow, blackConsole, testPrint);
    new TestTetris().addTetramino1_test(game, printNow, blackConsole, testPrint);
    new TestTetris().moveTetramino1_test(game, printNow, blackConsole, testPrint);
    new TestTetris().addTetramino2_test(game, printNow, blackConsole, testPrint);
    new TestTetris().moveTetramino2_test(game, printNow, blackConsole, testPrint);
    new TestTetris().addTetramino3_test(game, printNow, blackConsole, testPrint);
    new TestTetris().moveTetramino3_test(game, printNow, blackConsole, testPrint);
    new TestTetris().addTetramino4_test(game, printNow, blackConsole, testPrint);
    new TestTetris().moveTetramino4_test(game, printNow, blackConsole, testPrint);
    new TestTetris().addTetramino5_test(game, printNow, blackConsole, testPrint);
    new TestTetris().moveTetramino5_test(game, printNow, blackConsole, testPrint);
    new TestTetris().addTetramino6_test(game, printNow, blackConsole, testPrint);
    new TestTetris().moveTetramino6_test(game, printNow, blackConsole, testPrint);
    new TestTetris().addTetramino7_test(game, printNow, blackConsole, testPrint);
    new TestTetris().moveTetramino7_test(game, printNow, blackConsole, testPrint);
    new TestTetris().addTetramino8_test(game, printNow, blackConsole, testPrint);
    new TestTetris().moveTetramino8_test(game, printNow, blackConsole, testPrint);
    new TestTetris().play_test(game, printNow, blackConsole, testPrint);
    new TestTetris().gameOver_test(game, printNow, blackConsole, testPrint);
  }

  public TestTetris() {}

  public String toString() {

    return "TestTetris{" + "printBoard := " + Utils.toString(printBoard) + "}";
  }
}
