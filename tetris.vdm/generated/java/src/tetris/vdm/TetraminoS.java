package tetris.vdm;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class TetraminoS extends Tetramino {
  public void cg_init_TetraminoS_1(final Game game) {

    super.setColor(tetris.vdm.quotes.GreenQuote.getInstance());
    super.setId(5L);
    super.initialSetMinoes(game, SeqUtil.seq(1L, 6L));
    return;
  }

  public TetraminoS(final Game game) {

    cg_init_TetraminoS_1(game);
  }

  protected VDMSeq getNextMino(final VDMSeq position, final Number index) {

    VDMSeq result = Utils.copy(position);
    Number casesExp_24 = super.getOrientation();
    Number intPattern_64 = casesExp_24;
    Boolean success_24 = Utils.equals(intPattern_64, 0L);

    if (!(success_24)) {
      Number intPattern_65 = casesExp_24;
      success_24 = Utils.equals(intPattern_65, 1L);

      if (!(success_24)) {
        Number intPattern_66 = casesExp_24;
        success_24 = Utils.equals(intPattern_66, 2L);

        if (!(success_24)) {
          Number intPattern_67 = casesExp_24;
          success_24 = Utils.equals(intPattern_67, 3L);

          if (success_24) {
            Number intPattern_68 = index;
            Boolean success_25 = Utils.equals(intPattern_68, 2L);

            if (success_25) {
              Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() + 1L);
            } else {
              Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() + 1L);
            }
          }

        } else {
          Number intPattern_69 = index;
          Boolean success_26 = Utils.equals(intPattern_69, 2L);

          if (success_26) {
            Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() - 1L);
          } else {
            Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() + 1L);
          }
        }

      } else {
        Number intPattern_70 = index;
        Boolean success_27 = Utils.equals(intPattern_70, 2L);

        if (success_27) {
          Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() - 1L);
        } else {
          Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() - 1L);
        }
      }

    } else {
      Number intPattern_71 = index;
      Boolean success_28 = Utils.equals(intPattern_71, 2L);

      if (success_28) {
        Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() + 1L);
      } else {
        Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() - 1L);
      }
    }

    return Utils.copy(result);
  }

  protected VDMSeq getRotatedMino(final VDMSeq position) {

    VDMSeq result = Utils.copy(position);
    Number casesExp_29 = super.getOrientation();
    Number intPattern_72 = casesExp_29;
    Boolean success_29 = Utils.equals(intPattern_72, 0L);

    if (!(success_29)) {
      Number intPattern_73 = casesExp_29;
      success_29 = Utils.equals(intPattern_73, 1L);

      if (!(success_29)) {
        Number intPattern_74 = casesExp_29;
        success_29 = Utils.equals(intPattern_74, 2L);

        if (!(success_29)) {
          Number intPattern_75 = casesExp_29;
          success_29 = Utils.equals(intPattern_75, 3L);

          if (success_29) {
            Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() + 2L);
          }

        } else {
          Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() - 2L);
        }

      } else {
        Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() - 2L);
      }

    } else {
      Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() + 2L);
    }

    return Utils.copy(result);
  }

  public TetraminoS() {}

  public String toString() {

    return "TetraminoS{}";
  }
}
