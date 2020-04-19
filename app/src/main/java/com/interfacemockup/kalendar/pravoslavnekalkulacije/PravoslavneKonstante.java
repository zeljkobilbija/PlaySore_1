package com.interfacemockup.kalendar.pravoslavnekalkulacije;

import com.interfacemockup.kalendar.R;

public class PravoslavneKonstante {

    public PravoslavniKalendar sharedKalendar = PravoslavniKalendar.getInstance();
    public int[] daGaSkinemSaKurcaNajzad = new int[]{0, 0};

    public static final String SELECTED_ROW = "Selectovani Row";
   // public static final String NAZIV_MESECA = "Naziv Meseca";
    public int vaskrsMali;
    public int vaskrsVeliki;
    public int petrovskiPostMin;
    public int petrovskiPostMax;
    public int godina;

    public int globalniKatihizisInt;


    public void izracunajVaskrs(int counter) {

        godina = sharedKalendar.getGodinu(counter);

        if (godina == 2019) {

            vaskrsMali = 69;
            vaskrsVeliki = 118;

            petrovskiPostMin = 174;
            petrovskiPostMax = 194;
        }

        if (godina == 2020) {
            vaskrsMali = 61;
            vaskrsVeliki = 110;

            petrovskiPostMin = 175;
            petrovskiPostMax = 195;

        }
        if (godina == 2021) {
            vaskrsMali = 73;
            vaskrsVeliki = 122;

            petrovskiPostMin = 174;
            petrovskiPostMax = 194;
        }
        if (godina == 2022) {
            vaskrsMali = 65;
            vaskrsVeliki = 114;

            petrovskiPostMin = 174;
            petrovskiPostMax = 194;
        }
        if (godina == 2023) {
            vaskrsMali = 52;
            vaskrsVeliki = 106;

            petrovskiPostMin = 174;
            petrovskiPostMax = 194;
        }
        if (godina == 2024) {
            vaskrsMali = 76;
            vaskrsVeliki = 125;

            petrovskiPostMin = 175;
            petrovskiPostMax = 195;
        }
        if (godina == 2025) {
            vaskrsMali = 61;
            vaskrsVeliki = 110;

            petrovskiPostMin = 174;
            petrovskiPostMax = 194;
        }
        if (godina == 2026) {
            vaskrsMali = 53;
            vaskrsVeliki = 102;

            petrovskiPostMin = 174;
            petrovskiPostMax = 194;
        }
    }


    public void izracunajVaskrs() {

        godina = sharedKalendar.getTrenutnuGodinu();

        if (godina == 2019) {

            vaskrsMali = 69;
            vaskrsVeliki = 118;

            petrovskiPostMin = 174;
            petrovskiPostMax = 194;
        }

        if (godina == 2020) {
            vaskrsMali = 61;
            vaskrsVeliki = 110;

            petrovskiPostMin = 175;
            petrovskiPostMax = 195;

        }
        if (godina == 2021) {
            vaskrsMali = 73;
            vaskrsVeliki = 122;

            petrovskiPostMin = 174;
            petrovskiPostMax = 194;
        }
        if (godina == 2022) {
            vaskrsMali = 65;
            vaskrsVeliki = 114;

            petrovskiPostMin = 174;
            petrovskiPostMax = 194;
        }
        if (godina == 2023) {
            vaskrsMali = 52;
            vaskrsVeliki = 106;

            petrovskiPostMin = 174;
            petrovskiPostMax = 194;
        }
        if (godina == 2024) {
            vaskrsMali = 76;
            vaskrsVeliki = 125;

            petrovskiPostMin = 175;
            petrovskiPostMax = 195;
        }
        if (godina == 2025) {
            vaskrsMali = 61;
            vaskrsVeliki = 110;

            petrovskiPostMin = 174;
            petrovskiPostMax = 194;
        }
        if (godina == 2026) {
            vaskrsMali = 53;
            vaskrsVeliki = 102;

            petrovskiPostMin = 174;
            petrovskiPostMax = 194;
        }
    }

    public int[] drawables_prosta_godina;

    {
        drawables_prosta_godina = new int[]{R.drawable.ik_1, R.drawable.ik_2, R.drawable.ik_3, R.drawable.ik_4, R.drawable.ik_5, R.drawable.ik_6, R.drawable.ik_7, R.drawable.ik_8, R.drawable.ik_9, R.drawable.ik_10, R.drawable.ik_11, R.drawable.ik_12, R.drawable.ik_13,
                R.drawable.ik_14, R.drawable.ik_15, R.drawable.ik_16, R.drawable.ik_17, R.drawable.ik_18, R.drawable.ik_19, R.drawable.ik_20, R.drawable.ik_21, R.drawable.ik_22, R.drawable.ik_23, R.drawable.ik_24, R.drawable.ik_25, R.drawable.ik_26, R.drawable.ik_27,
                R.drawable.ik_28, R.drawable.ik_29, R.drawable.ik_30, R.drawable.ik_31, R.drawable.ik_32, R.drawable.ik_33, R.drawable.ik_34, R.drawable.ik_35, R.drawable.ik_36, R.drawable.ik_37, R.drawable.ik_38, R.drawable.ik_39, R.drawable.ik_40, R.drawable.ik_41,
                R.drawable.ik_42, R.drawable.ik_43, R.drawable.ik_44, R.drawable.ik_45, R.drawable.ik_46, R.drawable.ik_47, R.drawable.ik_48, R.drawable.ik_49, R.drawable.ik_50, R.drawable.ik_51, R.drawable.ik_52, R.drawable.ik_53, R.drawable.ik_54, R.drawable.ik_55,
                R.drawable.ik_56, R.drawable.ik_57, R.drawable.ik_58, R.drawable.ik_59, R.drawable.ik_61, R.drawable.ik_62, R.drawable.ik_63, R.drawable.ik_64, R.drawable.ik_65, R.drawable.ik_66, R.drawable.ik_67, R.drawable.ik_68, R.drawable.ik_69,
                R.drawable.ik_70, R.drawable.ik_71, R.drawable.ik_72, R.drawable.ik_73, R.drawable.ik_74, R.drawable.ik_75, R.drawable.ik_76, R.drawable.ik_77, R.drawable.ik_78, R.drawable.ik_79, R.drawable.ik_80, R.drawable.ik_81, R.drawable.ik_82, R.drawable.ik_83,
                R.drawable.ik_84, R.drawable.ik_85, R.drawable.ik_86, R.drawable.ik_87, R.drawable.ik_88, R.drawable.ik_89, R.drawable.ik_90, R.drawable.ik_91, R.drawable.ik_92, R.drawable.ik_93, R.drawable.ik_94, R.drawable.ik_95, R.drawable.ik_96, R.drawable.ik_97,
                R.drawable.ik_98, R.drawable.ik_99, R.drawable.ik_100, R.drawable.ik_101, R.drawable.ik_102, R.drawable.ik_103, R.drawable.ik_104, R.drawable.ik_105, R.drawable.ik_106, R.drawable.ik_107, R.drawable.ik_108, R.drawable.ik_109, R.drawable.ik_110, R.drawable.ik_111,
                R.drawable.ik_112, R.drawable.ik_113, R.drawable.ik_114, R.drawable.ik_115, R.drawable.ik_116, R.drawable.ik_117, R.drawable.ik_118, R.drawable.ik_119, R.drawable.ik_120, R.drawable.ik_121, R.drawable.ik_122, R.drawable.ik_123, R.drawable.ik_124, R.drawable.ik_125,
                R.drawable.ik_126, R.drawable.ik_127, R.drawable.ik_128, R.drawable.ik_129, R.drawable.ik_130, R.drawable.ik_131, R.drawable.ik_132, R.drawable.ik_133, R.drawable.ik_134, R.drawable.ik_135, R.drawable.ik_136, R.drawable.ik_137, R.drawable.ik_138, R.drawable.ik_139,
                R.drawable.ik_140, R.drawable.ik_141, R.drawable.ik_142, R.drawable.ik_143, R.drawable.ik_144, R.drawable.ik_145, R.drawable.ik_146, R.drawable.ik_147, R.drawable.ik_148, R.drawable.ik_149, R.drawable.ik_150, R.drawable.ik_151, R.drawable.ik_152, R.drawable.ik_153,
                R.drawable.ik_154, R.drawable.ik_155, R.drawable.ik_156, R.drawable.ik_157, R.drawable.ik_158, R.drawable.ik_159, R.drawable.ik_160, R.drawable.ik_161, R.drawable.ik_162, R.drawable.ik_163, R.drawable.ik_164, R.drawable.ik_165, R.drawable.ik_166, R.drawable.ik_167,
                R.drawable.ik_168, R.drawable.ik_169, R.drawable.ik_170, R.drawable.ik_171, R.drawable.ik_172, R.drawable.ik_173, R.drawable.ik_174, R.drawable.ik_175, R.drawable.ik_176, R.drawable.ik_177, R.drawable.ik_178, R.drawable.ik_179, R.drawable.ik_180, R.drawable.ik_181,
                R.drawable.ik_182, R.drawable.ik_183, R.drawable.ik_184, R.drawable.ik_185, R.drawable.ik_186, R.drawable.ik_187, R.drawable.ik_188, R.drawable.ik_189, R.drawable.ik_190, R.drawable.ik_191, R.drawable.ik_192, R.drawable.ik_193, R.drawable.ik_194, R.drawable.ik_195,
                R.drawable.ik_196, R.drawable.ik_197, R.drawable.ik_198, R.drawable.ik_199, R.drawable.ik_200, R.drawable.ik_201, R.drawable.ik_202, R.drawable.ik_203, R.drawable.ik_204, R.drawable.ik_205, R.drawable.ik_206, R.drawable.ik_207, R.drawable.ik_208, R.drawable.ik_209,
                R.drawable.ik_210, R.drawable.ik_211, R.drawable.ik_212, R.drawable.ik_213, R.drawable.ik_214, R.drawable.ik_215, R.drawable.ik_216, R.drawable.ik_217, R.drawable.ik_218, R.drawable.ik_219, R.drawable.ik_220, R.drawable.ik_221, R.drawable.ik_222, R.drawable.ik_223,
                R.drawable.ik_224, R.drawable.ik_225, R.drawable.ik_226, R.drawable.ik_227, R.drawable.ik_228, R.drawable.ik_229, R.drawable.ik_230, R.drawable.ik_231, R.drawable.ik_232, R.drawable.ik_233, R.drawable.ik_234, R.drawable.ik_235, R.drawable.ik_236, R.drawable.ik_237,
                R.drawable.ik_238, R.drawable.ik_239, R.drawable.ik_240, R.drawable.ik_241, R.drawable.ik_242, R.drawable.ik_243, R.drawable.ik_244, R.drawable.ik_245, R.drawable.ik_246, R.drawable.ik_247, R.drawable.ik_248, R.drawable.ik_249, R.drawable.ik_250, R.drawable.ik_251,
                R.drawable.ik_252, R.drawable.ik_253, R.drawable.ik_254, R.drawable.ik_255, R.drawable.ik_256, R.drawable.ik_257, R.drawable.ik_258, R.drawable.ik_259, R.drawable.ik_260, R.drawable.ik_261, R.drawable.ik_262, R.drawable.ik_263, R.drawable.ik_264, R.drawable.ik_265,
                R.drawable.ik_266, R.drawable.ik_267, R.drawable.ik_268, R.drawable.ik_269, R.drawable.ik_270, R.drawable.ik_271, R.drawable.ik_272, R.drawable.ik_273, R.drawable.ik_274, R.drawable.ik_275, R.drawable.ik_276, R.drawable.ik_277, R.drawable.ik_278, R.drawable.ik_279,
                R.drawable.ik_280, R.drawable.ik_281, R.drawable.ik_282, R.drawable.ik_283, R.drawable.ik_284, R.drawable.ik_285, R.drawable.ik_286, R.drawable.ik_287, R.drawable.ik_288, R.drawable.ik_289, R.drawable.ik_290, R.drawable.ik_291, R.drawable.ik_292, R.drawable.ik_293,
                R.drawable.ik_294, R.drawable.ik_295, R.drawable.ik_296, R.drawable.ik_297, R.drawable.ik_298, R.drawable.ik_299, R.drawable.ik_300, R.drawable.ik_301, R.drawable.ik_302, R.drawable.ik_303, R.drawable.ik_304, R.drawable.ik_305, R.drawable.ik_306, R.drawable.ik_307,
                R.drawable.ik_308, R.drawable.ik_309, R.drawable.ik_310, R.drawable.ik_311, R.drawable.ik_312, R.drawable.ik_313, R.drawable.ik_314, R.drawable.ik_315, R.drawable.ik_316, R.drawable.ik_317, R.drawable.ik_318, R.drawable.ik_319, R.drawable.ik_320, R.drawable.ik_321,
                R.drawable.ik_322, R.drawable.ik_323, R.drawable.ik_324, R.drawable.ik_325, R.drawable.ik_326, R.drawable.ik_327, R.drawable.ik_328, R.drawable.ik_329, R.drawable.ik_330, R.drawable.ik_331, R.drawable.ik_332, R.drawable.ik_333, R.drawable.ik_334, R.drawable.ik_335,
                R.drawable.ik_336, R.drawable.ik_337, R.drawable.ik_338, R.drawable.ik_339, R.drawable.ik_340, R.drawable.ik_341, R.drawable.ik_342, R.drawable.ik_343, R.drawable.ik_344, R.drawable.ik_345, R.drawable.ik_346, R.drawable.ik_347, R.drawable.ik_348, R.drawable.ik_349,
                R.drawable.ik_350, R.drawable.ik_351, R.drawable.ik_352, R.drawable.ik_353, R.drawable.ik_354, R.drawable.ik_355, R.drawable.ik_356, R.drawable.ik_357, R.drawable.ik_358, R.drawable.ik_359, R.drawable.ik_360, R.drawable.ik_361, R.drawable.ik_362, R.drawable.ik_363,
                R.drawable.ik_364, R.drawable.ik_365, R.drawable.ik_366
        };
    }

    public int[] dravables_prestupna_godina;

    {
        dravables_prestupna_godina = new int[]{
                R.drawable.ik_1, R.drawable.ik_2, R.drawable.ik_3, R.drawable.ik_4, R.drawable.ik_5, R.drawable.ik_6, R.drawable.ik_7, R.drawable.ik_8, R.drawable.ik_9, R.drawable.ik_10, R.drawable.ik_11, R.drawable.ik_12, R.drawable.ik_13, R.drawable.ik_14, R.drawable.ik_15,
                R.drawable.ik_16, R.drawable.ik_17, R.drawable.ik_18, R.drawable.ik_19, R.drawable.ik_20, R.drawable.ik_21, R.drawable.ik_22, R.drawable.ik_23, R.drawable.ik_24, R.drawable.ik_25, R.drawable.ik_26, R.drawable.ik_27, R.drawable.ik_28, R.drawable.ik_29,
                R.drawable.ik_30, R.drawable.ik_31, R.drawable.ik_32, R.drawable.ik_33, R.drawable.ik_34, R.drawable.ik_35, R.drawable.ik_36, R.drawable.ik_37, R.drawable.ik_38, R.drawable.ik_39, R.drawable.ik_40, R.drawable.ik_41, R.drawable.ik_42, R.drawable.ik_43,
                R.drawable.ik_44, R.drawable.ik_45, R.drawable.ik_46, R.drawable.ik_47, R.drawable.ik_48, R.drawable.ik_49, R.drawable.ik_50, R.drawable.ik_51, R.drawable.ik_52, R.drawable.ik_53, R.drawable.ik_54, R.drawable.ik_55, R.drawable.ik_56, R.drawable.ik_57,
                R.drawable.ik_58, R.drawable.ik_59, R.drawable.ik_60, R.drawable.ik_61, R.drawable.ik_62, R.drawable.ik_63, R.drawable.ik_64, R.drawable.ik_65, R.drawable.ik_66, R.drawable.ik_67, R.drawable.ik_68, R.drawable.ik_69, R.drawable.ik_70, R.drawable.ik_71,
                R.drawable.ik_72, R.drawable.ik_73, R.drawable.ik_74, R.drawable.ik_75, R.drawable.ik_76, R.drawable.ik_77, R.drawable.ik_78, R.drawable.ik_79, R.drawable.ik_80, R.drawable.ik_81, R.drawable.ik_82, R.drawable.ik_83, R.drawable.ik_84, R.drawable.ik_85,
                R.drawable.ik_86, R.drawable.ik_87, R.drawable.ik_88, R.drawable.ik_89, R.drawable.ik_90, R.drawable.ik_91, R.drawable.ik_92, R.drawable.ik_93, R.drawable.ik_94, R.drawable.ik_95, R.drawable.ik_96, R.drawable.ik_97, R.drawable.ik_98, R.drawable.ik_99,
                R.drawable.ik_100, R.drawable.ik_101, R.drawable.ik_102, R.drawable.ik_103, R.drawable.ik_104, R.drawable.ik_105, R.drawable.ik_106, R.drawable.ik_107, R.drawable.ik_108, R.drawable.ik_109, R.drawable.ik_110, R.drawable.ik_111, R.drawable.ik_112,
                R.drawable.ik_113, R.drawable.ik_114, R.drawable.ik_115, R.drawable.ik_116, R.drawable.ik_117, R.drawable.ik_118, R.drawable.ik_119, R.drawable.ik_120, R.drawable.ik_121, R.drawable.ik_122, R.drawable.ik_123, R.drawable.ik_124, R.drawable.ik_125,
                R.drawable.ik_126, R.drawable.ik_127, R.drawable.ik_128, R.drawable.ik_129, R.drawable.ik_130, R.drawable.ik_131, R.drawable.ik_132, R.drawable.ik_133, R.drawable.ik_134, R.drawable.ik_135, R.drawable.ik_136, R.drawable.ik_137, R.drawable.ik_138,
                R.drawable.ik_139, R.drawable.ik_140, R.drawable.ik_141, R.drawable.ik_142, R.drawable.ik_143, R.drawable.ik_144, R.drawable.ik_145, R.drawable.ik_146, R.drawable.ik_147, R.drawable.ik_148, R.drawable.ik_149, R.drawable.ik_150, R.drawable.ik_151,
                R.drawable.ik_152, R.drawable.ik_153, R.drawable.ik_154, R.drawable.ik_155, R.drawable.ik_156, R.drawable.ik_157, R.drawable.ik_158, R.drawable.ik_159, R.drawable.ik_160, R.drawable.ik_161, R.drawable.ik_162, R.drawable.ik_163, R.drawable.ik_164,
                R.drawable.ik_165, R.drawable.ik_166, R.drawable.ik_167, R.drawable.ik_168, R.drawable.ik_169, R.drawable.ik_170, R.drawable.ik_171, R.drawable.ik_172, R.drawable.ik_173, R.drawable.ik_174, R.drawable.ik_175, R.drawable.ik_176, R.drawable.ik_177,
                R.drawable.ik_178, R.drawable.ik_179, R.drawable.ik_180, R.drawable.ik_181, R.drawable.ik_182, R.drawable.ik_183, R.drawable.ik_184, R.drawable.ik_185, R.drawable.ik_186, R.drawable.ik_187, R.drawable.ik_188, R.drawable.ik_189, R.drawable.ik_190,
                R.drawable.ik_191, R.drawable.ik_192, R.drawable.ik_193, R.drawable.ik_194, R.drawable.ik_195, R.drawable.ik_196, R.drawable.ik_197, R.drawable.ik_198, R.drawable.ik_199, R.drawable.ik_200, R.drawable.ik_201, R.drawable.ik_202, R.drawable.ik_203,
                R.drawable.ik_204, R.drawable.ik_205, R.drawable.ik_206, R.drawable.ik_207, R.drawable.ik_208, R.drawable.ik_209, R.drawable.ik_210, R.drawable.ik_211, R.drawable.ik_212, R.drawable.ik_213, R.drawable.ik_214, R.drawable.ik_215, R.drawable.ik_216,
                R.drawable.ik_217, R.drawable.ik_218, R.drawable.ik_219, R.drawable.ik_220, R.drawable.ik_221, R.drawable.ik_222, R.drawable.ik_223, R.drawable.ik_224, R.drawable.ik_225, R.drawable.ik_226, R.drawable.ik_227, R.drawable.ik_228, R.drawable.ik_229,
                R.drawable.ik_230, R.drawable.ik_231, R.drawable.ik_232, R.drawable.ik_233, R.drawable.ik_234, R.drawable.ik_235, R.drawable.ik_236, R.drawable.ik_237, R.drawable.ik_238, R.drawable.ik_239, R.drawable.ik_240, R.drawable.ik_241, R.drawable.ik_242,
                R.drawable.ik_243, R.drawable.ik_244, R.drawable.ik_245, R.drawable.ik_246, R.drawable.ik_247, R.drawable.ik_248, R.drawable.ik_249, R.drawable.ik_250, R.drawable.ik_251, R.drawable.ik_252, R.drawable.ik_253, R.drawable.ik_254, R.drawable.ik_255,
                R.drawable.ik_256, R.drawable.ik_257, R.drawable.ik_258, R.drawable.ik_259, R.drawable.ik_260, R.drawable.ik_261, R.drawable.ik_262, R.drawable.ik_263, R.drawable.ik_264, R.drawable.ik_265, R.drawable.ik_266, R.drawable.ik_267, R.drawable.ik_268,
                R.drawable.ik_269, R.drawable.ik_270, R.drawable.ik_271, R.drawable.ik_272, R.drawable.ik_273, R.drawable.ik_274, R.drawable.ik_275, R.drawable.ik_276, R.drawable.ik_277, R.drawable.ik_278, R.drawable.ik_279, R.drawable.ik_280, R.drawable.ik_281,
                R.drawable.ik_282, R.drawable.ik_283, R.drawable.ik_284, R.drawable.ik_285, R.drawable.ik_286, R.drawable.ik_287, R.drawable.ik_288, R.drawable.ik_289, R.drawable.ik_290, R.drawable.ik_291, R.drawable.ik_292, R.drawable.ik_293, R.drawable.ik_294,
                R.drawable.ik_295, R.drawable.ik_296, R.drawable.ik_297, R.drawable.ik_298, R.drawable.ik_299, R.drawable.ik_300, R.drawable.ik_301, R.drawable.ik_302, R.drawable.ik_303, R.drawable.ik_304, R.drawable.ik_305, R.drawable.ik_306, R.drawable.ik_307,
                R.drawable.ik_308, R.drawable.ik_309, R.drawable.ik_310, R.drawable.ik_311, R.drawable.ik_312, R.drawable.ik_313, R.drawable.ik_314, R.drawable.ik_315, R.drawable.ik_316, R.drawable.ik_317, R.drawable.ik_318, R.drawable.ik_319, R.drawable.ik_320,
                R.drawable.ik_321, R.drawable.ik_322, R.drawable.ik_323, R.drawable.ik_324, R.drawable.ik_325, R.drawable.ik_326, R.drawable.ik_327, R.drawable.ik_328, R.drawable.ik_329, R.drawable.ik_330, R.drawable.ik_331, R.drawable.ik_332, R.drawable.ik_333,
                R.drawable.ik_334, R.drawable.ik_335, R.drawable.ik_336, R.drawable.ik_337, R.drawable.ik_338, R.drawable.ik_339, R.drawable.ik_340, R.drawable.ik_341, R.drawable.ik_342, R.drawable.ik_343, R.drawable.ik_344, R.drawable.ik_345, R.drawable.ik_346,
                R.drawable.ik_347, R.drawable.ik_348, R.drawable.ik_349, R.drawable.ik_350, R.drawable.ik_351, R.drawable.ik_352, R.drawable.ik_353, R.drawable.ik_354, R.drawable.ik_355, R.drawable.ik_356, R.drawable.ik_357, R.drawable.ik_358, R.drawable.ik_359,
                R.drawable.ik_360, R.drawable.ik_361, R.drawable.ik_362, R.drawable.ik_363, R.drawable.ik_364, R.drawable.ik_365, R.drawable.ik_366
        };

    }


    public int[] drawables_januar;
    {
        drawables_januar = new int[]{
                R.drawable.ik_1, R.drawable.ik_2, R.drawable.ik_3, R.drawable.ik_4, R.drawable.ik_5, R.drawable.ik_6, R.drawable.ik_7, R.drawable.ik_8, R.drawable.ik_9, R.drawable.ik_10, R.drawable.ik_11, R.drawable.ik_12, R.drawable.ik_13, R.drawable.ik_14, R.drawable.ik_15,
                R.drawable.ik_16, R.drawable.ik_17, R.drawable.ik_18, R.drawable.ik_19, R.drawable.ik_20, R.drawable.ik_21, R.drawable.ik_22, R.drawable.ik_23, R.drawable.ik_24, R.drawable.ik_25, R.drawable.ik_26, R.drawable.ik_27, R.drawable.ik_28, R.drawable.ik_29,
                R.drawable.ik_30, R.drawable.ik_31
        };
    }

    public int[] drawables_februar_big;
    {
        drawables_februar_big = new int[]{
                R.drawable.ik_32, R.drawable.ik_33, R.drawable.ik_34, R.drawable.ik_35, R.drawable.ik_36, R.drawable.ik_37, R.drawable.ik_38, R.drawable.ik_39, R.drawable.ik_40, R.drawable.ik_41, R.drawable.ik_42, R.drawable.ik_43,
                R.drawable.ik_44, R.drawable.ik_45, R.drawable.ik_46, R.drawable.ik_47, R.drawable.ik_48, R.drawable.ik_49, R.drawable.ik_50, R.drawable.ik_51, R.drawable.ik_52, R.drawable.ik_53, R.drawable.ik_54, R.drawable.ik_55, R.drawable.ik_56, R.drawable.ik_57,
                R.drawable.ik_58, R.drawable.ik_59, R.drawable.ik_60
        };
    }

    public int[] drawables_februar_small;
    {
        drawables_februar_small = new int[]{
                R.drawable.ik_32, R.drawable.ik_33, R.drawable.ik_34, R.drawable.ik_35, R.drawable.ik_36, R.drawable.ik_37, R.drawable.ik_38, R.drawable.ik_39, R.drawable.ik_40, R.drawable.ik_41, R.drawable.ik_42, R.drawable.ik_43,
                R.drawable.ik_44, R.drawable.ik_45, R.drawable.ik_46, R.drawable.ik_47, R.drawable.ik_48, R.drawable.ik_49, R.drawable.ik_50, R.drawable.ik_51, R.drawable.ik_52, R.drawable.ik_53, R.drawable.ik_54, R.drawable.ik_55, R.drawable.ik_56, R.drawable.ik_57,
                R.drawable.ik_58, R.drawable.ik_59
        };
    }

    public int[] drawables_mart;
    {
        drawables_mart = new int[]{
                R.drawable.ik_61, R.drawable.ik_62, R.drawable.ik_63, R.drawable.ik_64, R.drawable.ik_65, R.drawable.ik_66, R.drawable.ik_67, R.drawable.ik_68, R.drawable.ik_69, R.drawable.ik_70, R.drawable.ik_71,
                R.drawable.ik_72, R.drawable.ik_73, R.drawable.ik_74, R.drawable.ik_75, R.drawable.ik_76, R.drawable.ik_77, R.drawable.ik_78, R.drawable.ik_79, R.drawable.ik_80, R.drawable.ik_81, R.drawable.ik_82, R.drawable.ik_83, R.drawable.ik_84, R.drawable.ik_85,
                R.drawable.ik_86, R.drawable.ik_87, R.drawable.ik_88, R.drawable.ik_89, R.drawable.ik_90, R.drawable.ik_91
        };
    }
    public int[] drawables_april;
    {
        drawables_april = new int[]{
                R.drawable.ik_92, R.drawable.ik_93, R.drawable.ik_94, R.drawable.ik_95, R.drawable.ik_96, R.drawable.ik_97, R.drawable.ik_98, R.drawable.ik_99,
                R.drawable.ik_100, R.drawable.ik_101, R.drawable.ik_102, R.drawable.ik_103, R.drawable.ik_104, R.drawable.ik_105, R.drawable.ik_106, R.drawable.ik_107, R.drawable.ik_108, R.drawable.ik_109, R.drawable.ik_110, R.drawable.ik_111, R.drawable.ik_112,
                R.drawable.ik_113, R.drawable.ik_114, R.drawable.ik_115, R.drawable.ik_116, R.drawable.ik_117, R.drawable.ik_118, R.drawable.ik_119, R.drawable.ik_120, R.drawable.ik_121
        };
    }
    public int[] drawables_maj;
    {
        drawables_maj = new int[]{
                R.drawable.ik_122, R.drawable.ik_123, R.drawable.ik_124, R.drawable.ik_125,
                R.drawable.ik_126, R.drawable.ik_127, R.drawable.ik_128, R.drawable.ik_129, R.drawable.ik_130, R.drawable.ik_131, R.drawable.ik_132, R.drawable.ik_133, R.drawable.ik_134, R.drawable.ik_135, R.drawable.ik_136, R.drawable.ik_137, R.drawable.ik_138,
                R.drawable.ik_139, R.drawable.ik_140, R.drawable.ik_141, R.drawable.ik_142, R.drawable.ik_143, R.drawable.ik_144, R.drawable.ik_145, R.drawable.ik_146, R.drawable.ik_147, R.drawable.ik_148, R.drawable.ik_149, R.drawable.ik_150, R.drawable.ik_151,
                R.drawable.ik_152
        };
    }
    public int[] drawables_jun;
    {
        drawables_jun = new int[]{
                R.drawable.ik_153, R.drawable.ik_154, R.drawable.ik_155, R.drawable.ik_156, R.drawable.ik_157, R.drawable.ik_158, R.drawable.ik_159, R.drawable.ik_160, R.drawable.ik_161, R.drawable.ik_162, R.drawable.ik_163, R.drawable.ik_164,
                R.drawable.ik_165, R.drawable.ik_166, R.drawable.ik_167, R.drawable.ik_168, R.drawable.ik_169, R.drawable.ik_170, R.drawable.ik_171, R.drawable.ik_172, R.drawable.ik_173, R.drawable.ik_174, R.drawable.ik_175, R.drawable.ik_176, R.drawable.ik_177,
                R.drawable.ik_178, R.drawable.ik_179, R.drawable.ik_180, R.drawable.ik_181, R.drawable.ik_182
        };
    }
    public int[] drawables_jul;
    {
        drawables_jul = new int[]{
                R.drawable.ik_183, R.drawable.ik_184, R.drawable.ik_185, R.drawable.ik_186, R.drawable.ik_187, R.drawable.ik_188, R.drawable.ik_189, R.drawable.ik_190,
                R.drawable.ik_191, R.drawable.ik_192, R.drawable.ik_193, R.drawable.ik_194, R.drawable.ik_195, R.drawable.ik_196, R.drawable.ik_197, R.drawable.ik_198, R.drawable.ik_199, R.drawable.ik_200, R.drawable.ik_201, R.drawable.ik_202, R.drawable.ik_203,
                R.drawable.ik_204, R.drawable.ik_205, R.drawable.ik_206, R.drawable.ik_207, R.drawable.ik_208, R.drawable.ik_209, R.drawable.ik_210, R.drawable.ik_211, R.drawable.ik_212, R.drawable.ik_213
        };
    }
    public int[] drawables_avgust;
    {
        drawables_avgust = new int[]{
                R.drawable.ik_214, R.drawable.ik_215, R.drawable.ik_216,
                R.drawable.ik_217, R.drawable.ik_218, R.drawable.ik_219, R.drawable.ik_220, R.drawable.ik_221, R.drawable.ik_222, R.drawable.ik_223, R.drawable.ik_224, R.drawable.ik_225, R.drawable.ik_226, R.drawable.ik_227, R.drawable.ik_228, R.drawable.ik_229,
                R.drawable.ik_230, R.drawable.ik_231, R.drawable.ik_232, R.drawable.ik_233, R.drawable.ik_234, R.drawable.ik_235, R.drawable.ik_236, R.drawable.ik_237, R.drawable.ik_238, R.drawable.ik_239, R.drawable.ik_240, R.drawable.ik_241, R.drawable.ik_242,
                R.drawable.ik_243, R.drawable.ik_244
        };
    }
    public int[] drawables_septembar;
    {
        drawables_septembar = new int[]{
                R.drawable.ik_245, R.drawable.ik_246, R.drawable.ik_247, R.drawable.ik_248, R.drawable.ik_249, R.drawable.ik_250, R.drawable.ik_251, R.drawable.ik_252, R.drawable.ik_253, R.drawable.ik_254, R.drawable.ik_255,
                R.drawable.ik_256, R.drawable.ik_257, R.drawable.ik_258, R.drawable.ik_259, R.drawable.ik_260, R.drawable.ik_261, R.drawable.ik_262, R.drawable.ik_263, R.drawable.ik_264, R.drawable.ik_265, R.drawable.ik_266, R.drawable.ik_267, R.drawable.ik_268,
                R.drawable.ik_269, R.drawable.ik_270, R.drawable.ik_271, R.drawable.ik_272, R.drawable.ik_273, R.drawable.ik_274
        };
    }
    public int[] drawables_oktobar;
    {
        drawables_oktobar = new int[]{
                R.drawable.ik_275, R.drawable.ik_276, R.drawable.ik_277, R.drawable.ik_278, R.drawable.ik_279, R.drawable.ik_280, R.drawable.ik_281,
                R.drawable.ik_282, R.drawable.ik_283, R.drawable.ik_284, R.drawable.ik_285, R.drawable.ik_286, R.drawable.ik_287, R.drawable.ik_288, R.drawable.ik_289, R.drawable.ik_290, R.drawable.ik_291, R.drawable.ik_292, R.drawable.ik_293, R.drawable.ik_294,
                R.drawable.ik_295, R.drawable.ik_296, R.drawable.ik_297, R.drawable.ik_298, R.drawable.ik_299, R.drawable.ik_300, R.drawable.ik_301, R.drawable.ik_302, R.drawable.ik_303, R.drawable.ik_304, R.drawable.ik_305
        };
    }
    public int[] drawables_novembar;
    {
        drawables_novembar = new int[]{
                R.drawable.ik_306, R.drawable.ik_307,
                R.drawable.ik_308, R.drawable.ik_309, R.drawable.ik_310, R.drawable.ik_311, R.drawable.ik_312, R.drawable.ik_313, R.drawable.ik_314, R.drawable.ik_315, R.drawable.ik_316, R.drawable.ik_317, R.drawable.ik_318, R.drawable.ik_319, R.drawable.ik_320,
                R.drawable.ik_321, R.drawable.ik_322, R.drawable.ik_323, R.drawable.ik_324, R.drawable.ik_325, R.drawable.ik_326, R.drawable.ik_327, R.drawable.ik_328, R.drawable.ik_329, R.drawable.ik_330, R.drawable.ik_331, R.drawable.ik_332, R.drawable.ik_333,
                R.drawable.ik_334, R.drawable.ik_335
        };
    }
    public int[] drawables_decembar;
    {
        drawables_decembar = new int[]{
                R.drawable.ik_336, R.drawable.ik_337, R.drawable.ik_338, R.drawable.ik_339, R.drawable.ik_340, R.drawable.ik_341, R.drawable.ik_342, R.drawable.ik_343, R.drawable.ik_344, R.drawable.ik_345, R.drawable.ik_346,
                R.drawable.ik_347, R.drawable.ik_348, R.drawable.ik_349, R.drawable.ik_350, R.drawable.ik_351, R.drawable.ik_352, R.drawable.ik_353, R.drawable.ik_354, R.drawable.ik_355, R.drawable.ik_356, R.drawable.ik_357, R.drawable.ik_358, R.drawable.ik_359,
                R.drawable.ik_360, R.drawable.ik_361, R.drawable.ik_362, R.drawable.ik_363, R.drawable.ik_364, R.drawable.ik_365, R.drawable.ik_366

        };
    }

    public String[] molitveNazivi;
    {
        molitveNazivi = new String[]{
                "Оче наш","Символ Вере","Псалам 50","Јутарња молитва",
                "Свакодневна Молитва","Молитва Пресветој Богородици у невољи и потиштености",
                "Молитва Анђелу Чувару","Вечерња Молитва","Молитва Мајци Божијој","Молитва пред Свето Причешће",
                "Молитва после Светог Причешћа","Молитва за болесне","Десет Божијих Заповести","Две највеће Христове Заповести",
                "МОЛИТВА ПОКАЈНИКА", "Молитва против ружних помисли", "МОЛИТВА ЧАСНОМЕ КРСТУ", "МОЛИТВЕ СВЕТОЈ ТРОЈИЦИ",
                "Молитва Светом Николи", "МОЛИТВА СВЕТОЈ ВЕЛИКОМУЧЕНИЦИ МАРИНИ - ОГЊЕНА МАРИЈА", "Молитва Светом Сави",
                "Молитва Светом Василију Острошком"
        };
    }

    public String[] molitveTekst;
    {
        molitveTekst = new String[]{
                "ОЧЕ НАШ, који си на Небесима\nДа се свети име Твоје\nДа дође Царство Твоје\nДа буде Воља Твоја\nИ на земљи као што је на Небесима\nХлеб наш насушни дај нам данас\nИ опрости нам дугове наше\nКао што и ми опраштамо дужницима својим\nИ не уведи нас у искушења\nНо избави нас од злога\nЈер је Твоје Царство и Сила и Слава\nСада и увек и у векове векова.", "Верујем у једнога Бога Оца, Сведржитеља, Творца неба и земље и свега видљивог и невидљивог.\n\nИ у једнога Господа Исуса Христа, Сина Божијег, Јединородног, рођеног од Оца пре свих векова, Светлост од Светлости, Бога истинитог од Бога истинитог, рођеног не створеног, једносуштног Оцу, кроз кога је све постало;\n\nКоји је ради нас људи и ради нашега спасења сишао с небеса и оваплотио се од Духа Светог и Марије Дјеве и постао човек;\n\nИ Који је распет за нас у време Понтија Пилата, и страдао и погребен;\n\nИ Који је васкрсао у трећи дан по Писму;\n\nИ Који се узнео на небеса и седи с десне стране Оца;\n\nИ Који ће опет доћи са славом да суди живима и мртвима, и Његовом Царству неће бити краја.\n\nИ у Духа Светог, Господа, Животворног, Који од Оца исходи, Који се заједно са Оцем и Сином обожава и слави, Који је говорио кроз пророке.\n\nУ једну, свету, саборну и апостолску Цркву.\n\nИсповедам једно крштење за отпуштење грехова.\n\nЧекам васкрсење мртвих.\n\nИ живот будућег века. Амин.", "Помилуј ме, Боже, по великој милости Својој и по обиљу милосрђа Свога очисти безакоње моје. Опери ме добро од безакоња мога и од греха мога очисти ме. Јер безакоње своје ја знам и грех је мој стално преда мном. Теби јединоме сагреших, и зло пред Тобом учиних, а Ти си праведан у речима Својим и чист у суду Своме. Гле, у безакоњима се зачех и у гресима роди ме мати моја. Гле, истину љубиш, и јављаш ми непознатости и тајности премудрости Своје. Покропи ме исопом и очистићу се; умиј ме и бићу бељи од снега. Дај ми да слушам радост и весеље, да се прену кости потрвене. Одврати Лице Своје од грехова мојих, и сва безакоња моја очисти. Срце чисто сагради у мени, Боже, и дух бодар обнови у утроби мојој. Не одгурни ме од Лица Твога, и Духа Твога Светог не одузми од мене. Дај ми радост спасења Твога, и духом владалачким утврди ме. Научићу безаконике путевима Твојим, и безбожници ће се обратити Теби. Избави ме од крви, Боже, Боже спасења мога; обрадоваће се језик мој правди Твојој. Господе, отвори уста моја и она ће казивати славу Твоју. Јер да си хтео жртве, ја бих Ти принео; за жртве паљенице не мариш. Жртва је Богу дух скрушен; срце скрушено и смерно Бог неће одбацити. По доброти Својој, Господе, чини добро Сиону, и нека се подигну зидови јерусалимски. Тада ће ти бити миле жртве правде, приноси и жртве паљенице. Тада ће метати на жртвеник Твој теоце.", "Уставши од сна, благодарим Ти, Света Тројице, што се због своје велике доброте и дуготрпељивости ниси разљутила на мене ленога и грешнога, нити ме погубила због безакоња мојих, него си показала Своје уобичајено човекољубље и подигла мене који сам лежао несвесно, да Ти јутрењујем и славим моћ Твоју. И сада просвети моје духовне очи, отвори моја уста да се поучавам речима твојим и разумем заповести Твоје и творим вољу Твоју и певам Теби у срдачном исповедању и славим пресвето име Твоје, Оца и Сина и Светога Духа, сада и увек и у векове векова. Амин.", "Господе дај ми да мирно примим све што ми донесе данашњи дан, и да се потпуно предам Твојој светој вољи. Упућуј ме и помажи свакога часа у току овога дана. Било какве вести да добијем, научи ме да их примим мирно и с чврстим уверењем да све бива по Твојој светој вољи. Управљај мојим мислима и осећањима и у свим делима и речима. Не допусти да у непредвиђеним случајевима заборавим да све долази од Тебе. Научи ме да се правилно односим према својим родитељима и својим ближњима, да никог не разгњевим и ожалостим. Господе дај ми снаге да поднесем замор данашњег дана и све што се у току дана догоди. Управљај мојом вољом и научи ме да се молим, да верујем, да се надам, да трпим, да праштам и волим. Амин.", "Преподобна Царице моја, Пресвета надо моја, уточиште сиротих, заштитнице путника, помоћнице онима који су у беди и заштито оних које злостављају. Види моју невољу, види моју муку. Са свих страна сам опкољен искушењем, а нема никог да ме брани, Ти ми сама помогни јер сам немоћан. Нахрани ме као странца, упута ме као заблуделог, излечи ме и спаси као безнадежног. Немам друге помоћи ни друге заштите, ни утехе осим Тебе, о, Мајко свих невољних и оптерећених. Стога, погледај на мене грешног и потиштеног, закрили ме Пресветим покровом својим да бих се избавио од зала која су ме опколила и ја ћу увек славити преславно име Твоје. Амин!", "Анђеле Христов, чувару мој свети, и заштитниче душе и тела мога, опрости ми све што сагреших у данашњи дан, и избави ме од свакога непријатељског ми противника да не бих никаквим грехом разгњевио Бога мог, но моли се за мене грешног и недостојног слугу да ме покажеш достојна доброте и милости Свесвете Тројице, и матере Господа мога Исуса Христа, и свих Светих. Амин.", "Боже вечни и Царе сваког створења који си ме удостојио да доживим до овога часа, опрости ми грехе које учиних овога дана делом, речју и мислима. И очисти Господе, смирену душу моју од сваке прљавштине тела и духа. И дај ми, Господе, да ми сан ове ноћи прође у миру да бих уставши са скромне постеље, угађао пресветом имену Твом, у све дане живота мога, и победио све телесне и бестелесне непријатеље који војују на мене. И избави ме, Господе, од сујетних помисли и рђавих жеља које ме прљају. Јер је Твоје царство, и сила, и слава Оца и Сина и Светога Духа, сада и увек у векове векова. Амин.", "Прими свеблагомоћна, Пречиста Владичице Богородитељко, часне дарове. И теби јединој прикладне, од нас недостојних слугу Твојих; од свих покољења изабрана, која си се од свих створења небеских и земаљских узвишенија јавила, светија од херувима, и од серафима славнија, од памтивијека скривена тајна, и анђелима непозната, која си од анђела радост примила!\n\nКоју похвалу да ти принесемо, Пречиста? Како да те назовемо, Богородице?\n\nЈер Пророчких ријечи сагласје слушали смо ми о Теби, анђелско стајање пред Тобом [гледали] са страхом и трепетом, чедно [родивши (зачелом)], јер носиш тијело човјечје [примившега] и оног који носи све и сва, и који је проповиједи свих светих о теби испунио. Владичице, не презри мало мољење моје, сагријешисмо, да не погинемо.\n\nТи си заступница роду човјечијем, јер си родом милостива и која си милостивога родила. Пречисте усне отвори и милостивом молитвом умоли Га за нас.\n\nТи која си чистија од сунца и која си засијала да нас огријеш, нас који сједимо у тами, Твоје најмилостивије заступништво пред Њега стављамо, да нас пречистим Твојим молитвама избави оне грозне и страшне муке у Дан његовог [другог] Доласка.", "Верујем, Господе, и исповедам да си Ти заиста Христос, Син Бога живога, Који си дошао у свет да грешнике спасеш, од којих сам први ја. Још вјерујем да је ово само пречисто Тело Твоје, и ова сама пречасна Крв Твоја. Стога Ти се молим: помилуј ме, и опрости ми сагрешења моја хотимична и нехотимична, учињена речју и делом, свесно и несвесно, и удостој ме да се неосуђено причестим пречистим тајнама Твојим на отпуштање грехова и на живот вечни. Прими ме данас, Сине Божији, за причасника Тајне Вечере Твоје, јер нећу казати Тајну непријатељима Твојим, нити ћу Ти дати целив као Јуда, већ као покајани разбојник исповедам Те: сети ме се Господе, у Царству Твоме. Да ми причешћивање Твојим Светим Тајнама, Господе, не буде на суд или осуду, него на исцељење душе и тела. Амин.", "Твоје свето Тело, Господе Исусе Христе Боже наш, нека ми буде на живот вечни, и пречасна крв Твоја на отпуштење грехова. Нека ми ово причешће буде на радост, здравље и весеље; и на Твом страшном другом доласку удостоји ме грешника да станем с десне стране славе Твоје, заступништвом пречисте Матере Твоје и свих светих твојих.", "Владико Сведржитељу, Свети Царе, Који уразумљујеш и не усмрћујеш, Који клецајуће утврђујеш и оборене усправљаш и телесне муке човекове отклањаш, молимо се Теби, Боже наш, слугу Свога (име болесника) који болује, посети милошћу Својом. опрости му свако сагрешење вољно и невољно. О, Господе, излечујући силу Своју са Небеса пошаљи, прикосни се тела његова, угаси грозницу, укроти страст и сваку болест која се крије у њему, буди Лекар слуге Свога (име болесника) подигни га са постеље болесничке и са одра страдања његовог и даруј га исцељеног Цркви Својој, да благоугађа Теби и твори вољу Твоју. Јер Твоје је да нас милујеш и спашаваш, Боже наш, и Теби славу узносимо Оцу и Сину и Светоме Духу, сада и свагда и у векове векова. Амин.", "1. Ја сам Господ Бог Твој, немој имати других богова осим мене,\n\n2. Не прави себи идола нити каква лика, немој им се клањати нити им служити.\n\n3. Не узимај узалуд имена Господа Бога свога.\n\n4. Сећај се дана одмора да га светкујеш; шест дана ради и сврши све своје послове, а седми дан је одмор Господу Богу твоме.\n\n5. Поштуј оца свога и матер своју, да ти добро буде и да дуго поживиш на земљи.\n\n6. Не убиј.\n\n7. Не чини прељубе.\n\n8. Не кради.\n\n9 Не сведочи лажно на ближњега свога.\n\n10. Не пожели ништа што је туђе.", "1. Љуби Господа Бога свога свим срцем својим, свом душом својом, свим умом својим и свом снагом својом.\n\n2. Љуби ближњега свога као самога себе.", "ГОСПОДЕ, Ти све видиш, и нема ничега што Ти не би видео. Ја, иако сам дело руку Твојих ипак нисам чинио дела по заповестима Твојим, него сам по великом безумљу свом чинио свако зло, не помишљајући да си Ти, Творац мој и Бог, колико добар толико и правосудан. А сада, сетивши се тога, мене спопада страх, и ја не знам шта да чиним. Осећам осуду Твоју, и не налазим речи оправдања у устима својим. Немам никакве врлине и нисам учинио никакво дело покајања, које би заслуживало да ми се због њега опрости макар једна празна реч уста мојих. Осим тога, и онај који има све врлине и чини сваковрсна добра дела, чини то као слуга и дужник; у свему томе он неће наћи откуп за Грех свој: ту једино милост Твоја притиче. Грех је смрт, и ко од оних који су кроз њега умрли може васкрснути сам себе? Ваистину нико. Једини си Ти умро и васкрсао, зато што греха ниси учинио и превара се не нађе у устима Твојим. И ето, Господе Сведржитељу, починивши много злих дела, ја се кајем. Али само покајање немоћно је да ме оправда. Покајање је познање грехова својих, а скида их милост Твоја. Ти видиш, Сведржитељу Господе, да ја сада ништа немам осим тела; но за мене нема никакве користи од тога што сам оставио свако богатство. Ја сам сав - једна рана; у мени није остало никакве наде на спасење, и пакао је готов да ме прогута живог. Ти ме једини можеш спасти и излечити патње срца мога. Рука Твоја може све; она досеже до самих дубина бездана, и све бива по мигу Твоме. Не усуђујем се говорити: помилуј ме, Господе! Јер сам недостојан милости Твоје, као онај који с правом заслужује сваку муку. А Ти, Господе, знаш све, и како зна Човекољубље Твоје поступи са мном, недостојним и самог живота. Да буде света воља Твоја у свему. Амин.", "Владаре Господе Боже мој, у Твојим је рукама живот мој, заштити ме по милости својој, и не допусти да пропаднем са безакоњима својим, нити да идем за вољом тела које похотом војује против духа. Твоје сам створење; не презри дело руку својих, Немој се одвратити од мене; сажали се, а не понизи. Слаб сам, немој ме презрети, Господе, јер Теби прибегох заштитинику своме Богу: исцели душу моју, јер сагреших Теби, спаси ме ради милости Твоје, јер сам Ти одан од младости своје; нека се постиде они што траже да ме одгурну од Тебе помоћу нечистих дела, ружних помисли, некорисних сећања; удаљи од мене сваку нечистоту, свако зло, јер си Ти једини бесмртан, у свему беспримерно моћан, и свима дајеш силу за борбу против ђавола и његових војски. Јер Теби приличи свака слава, част и поклоњење, Оцу и Сину и Светоме Духу, сада и увек и у векове векова. Амин.", "Слава Господе, Крсту Твоме Часноме!\n\nНека васкрсне Бог, и нека се развеју непријатељи Његови, и нека беже од Лица Његова они који га мрзе. Нека ишчезну као што ишчезава дим, као што се топи восак на домаку огња; тако нека изгину ђаволи пред лицем оних који љубе Бога и осењују се крсним знаком, и који радосно говоре: Радуј се, пречасни и животворни Крсте Господњи, који прогониш ђаволе силом распетог на теби Господа нашег Исуса Христа, који је сишао у пакао и сатро силу ђаволску, и који нам је даровао тебе, Крст Свој Часни, за прогањање сваког противника. О, пречасни и животворни Крсте Господњи, помажи ми увек са Светом Владарком, Дјевом Богородицом, и са свима Светима занавек. Амин.", "МОЛИТВА БОГУ ОЦУ\n\nСвемогући Владико, премудри и свеблаги Господе, свебеспочетни Родитељу светлоначалног Сина, и вечни и постојани Самоизводитељу животворног Духа Твог; величина је Твоја неизмерна, слава неисказана, и милост безмерна; благодаримо Ти што си нас дозвао из небића и почаствовао нас драгоценим ликом Својим, што си нама недостојнима даровао не само да Те познамо и љубимо, него, што је најслађе, да Те и Оцем својим називамо. Благодаримо Ти, Боже милосрђа и доброте, што нас, који смо преступили заповест Твоју, ниси оставио усред греха и замке смрти, него си благоволео Јединородног Сина Свог, којим су и векови створени, послати на земљу ради спасења нашег, да бисмо се Његовим очовечењем и страшним страдањима ослободили насиља ђавољег и трулежности смртне. Благодаримо Ти, Боже љубави и сила, што си, по вазнесењу на небо премилог Спаситеља нашег, умољен Крстом Његовим, ниспослао Духа Свог на Његове изабране ученике и апостоле, да они, силом бого-надахнуте проповеди своје, обасјају сав свет бесмртном светлошћу Еванђеља Христова. Стога, човекољубиви Владико, услиши сада смирену молитву недостојних чеда Твојих, да, као што си нас саздао једино по доброти Својој и искупио нас једино по самилости Својој, тако нас и спасеш једино по беспримерном милосрђу Свом: јер по делима нашим немамо ни трунке спасења већ чекање праведне одмазде и одбацивање од пресветог лица Твог. Јер, када ће се на дан Суда испитивати и истраживати и свака празна реч, какав ћемо онда, ми бедници, одговор дати за безбројна безакоња наша којима сагрешисмо пред Тобом? Зато, без икакве наде на оправдање делима нашим, ми прибегавамо једино Твојој доброти, која превазилази сваки ум и сваку реч; и имајући њу као тврди темељ наше наде, ми Те молимо: сагрешисмо, Господе, очисти нас! безаконовасмо, Владико, опрости нам! прогневисмо Те, Дуготрпељиви, не срди се на нас, и сачувај од прљавштина светских ум наш, савест и срце! избави нас и спаси од опасне буре страсти и грехопада, вољних и невољних, знаних и незнаних, и упути нас у тихо пристаниште вере, љубави и наде па вечни живот! Помени нас, Господе, у милости Својој, даруј нам све што молимо за наше спасење, нарочито пак чист и безгрешан живот; удостоји нас да Те љубимо и да Те се од свег срца бојимо, и да у свему творимо Твоју свету вољу, молитвама Пречисте Владичице наше Богородице, и свих Светих Твојих, јер си благ и човекољубив Бог, и Теби славу и благодарење и поклоњење узносимо, са Јединородним Твојим Сином, и са Пресветим и благим и животворним Твојим Духом, сада и увек и кроза све векове, Амин.\n\nМОЛИТВА БОГУ СИНУ\n\nЈединородни Сине и Речи Божја, Ти си изволео оваплотити се и смрт поднети ради спасења нашег; а сада, када и са пречистим телом Својим седиш са Оцем на престолу на небесима и управљаш целим светом, не заборави милосрђем Својим нас доле на земљи, искушаване многим напастима и невољама; и мада смо потпуно нечисти и недостојни, но ми верујемо у Тебе, Спаситеља и Господа нашег, и не знамо за другог посредника и за другу наду спасења. Подај нам, о Искупитељу свеблаги, да се увек сећамо колико си душевних и телесних мука поднео за наше спасење, и како си пречистом душом Својом са крста сишао чак до ада, да нас ослободиш власти и насиља адова; а сећајући се тога, дај нам да се чувамо од страсти и грехова, који су били узрок љутих страдања и смрти Твоје, и да љубимо правду и врлину, што је Теби пријатније у нама од свакога дара. Као искушан у свему, Ти сам знаш, о Свеблаги, како је велика немоћ духа и тела нашег, а непријатељ наш моћан и препреден, јер као лав ричући ходи и иште кога да прождере. Зато нам не ускрати Своју свемоћну помоћ, и буди увек с нама, чувајући и крилећи, упућујући и укрепљујући, радујући и веселећи дух наш. Ми пак, бацајући се у наручје љубави и милосрђа Твог, предајемо Теби, Владици нашем, Искупитељу и Господу, сав наш временски и вечни живот, молећи из дна душе, да како год знаш, учиниш да ми безопасно пређемо мрачну долину овог земаљског живота, и доспемо до богокрасних дворова Твојих, које си обећао припремити свима који верују у име Твоје и следују божанственим стопама Твојим. Амин.\n\nМОЛИТВА БОГУ ДУХУ СВЕТОМ\n\nЦаре небесни, Утешитељу свеблаги, Душе истине, који од Оца вечито исходиш и у Сину увек почиваш. Независни Изворе божанствених дарова, које раздељујеш свакоме како хоћеш, којима се и ми недостојни осветисмо и запечатисмо у дан крштења нашег, – погледај на молитву слугу Твојих; дођи к нама, усели се у нас, и очисти душе наше, да будемо спремљени за обиталиште Пресвете Тројице. О Свеблаги, немој се згадити на нашу нечистоту и ране греховне, него их исцели свелечећим помазањем Твојим: просвети ум наш, да бисмо познали таштину света и оно што је у свету; оживи савест нашу, да би нам неућутно казивала шта треба чинити и шта одбацивати; исправи и обнови срце наше, да не точи из себе дан и ноћ зле мисли и неприличне жеље; укроти тело наше и росоносним дахом Својим угаси пламен страсти, којим се помрачује у нама драгоцени лик Божји; одагнај из нас дух лености, мрзовоље, властољубља и празнословља, а подај нам дух љубави и трпљења, дух кротости и смирења, дух чистоте и правде, да бисмо, исправивши раслабљена срца и колена, вредно хитали путем светих заповести, и тако избегавајући сваки грех и испуњујући сваку правду, удостојили се добити крај миран и непостиђен, ући у Небесни Јерусалим, и тамо се поклонити Теби, уједно са Оцем и Сином, појући кроза све векове: Тројице Света, слава Теби!\n\nМОЛИТВА ПРЕСВЕТОЈ ТРОЈИЦИ\n\nПресвета Тројице, једносушна моћи, узроче свих добара, чиме ћемо Ти узвратити за све што си дала нама грешнима и недостојнима пре но што дођосмо на свет; за све што свакоме од нас дајеш сваки дан, и за оно што си свима нама припремила у будућем животу! Требало је стога да ти за толика доброчинства и доброте, благодаримо не само речима него поготову делима, држећи и испуњујући заповести Твоје; али ми, занети својим страстима и рђавим навикама, стрмоглависмо се од младости у безбројне грехе и безакоња. Зато ми нечисти и оскврнављени, не само нисмо били достојни јавити се пред трисветло лице Твоје, него ни име Твоје пресвето изговорити, да Ти сама ниси благоизволела, на охрабрење наше, објавити да, љубећи чисте и праведне, Ти и грешнике који се кају милујеш и милосрдно примаш. О свебожанствена Тројице, са висине свете славе Своје погледај на нас многогрешне, и нашу добру вољу прими уместо добрих дела, и подај нам дух истинског покајања, да бисмо, омрзнувши сваки грех, поживели у чистоти и правди до краја дана наших, творећи пресвету вољу Твоју, и славећи чистим мислима и добрим делима преслатко и величанствено Име Твоје. Амин.", "МОЛИТВА ПРВА СВЕТОМ НИКОЛАЈУ\n\nО, свехвални и свечесни архијереју, велики чудотворче, светитељу Христов оче Николаје, Божји човече и верни слуго, жељено биће, сасуде изабрани, чврсти стубе Цркве, пресјајни светилниче, звездо која обасјаваш и осветљаваш сву васељену. ти си праведник, узрастао си као палма посађена у дворима Господа свог, живео си у граду Миру, миром си замирисао и изливаш непресушно миро благодати Божје. Својим путовањем, пресвети оче, море си осветио, када многочудотворне мошти твоје путоваху у град Бари, да од истока до запада славе име господње. О, прекрасни и предивни чудотворче, брзи помоћниче, усрдни заштитниче, предобри пастиру који духовно стадо спасаваш од разноврсних опасности, тебе прослављамо и тебе величамо као наду свих хришћана, извор чудеса, покровитеља верних, премудрог учитеља, хранитеља гладних, радост уплаканих, одећу нагих, лекара болесних, крманоша морепловцима, ослободитеља сужњима, старатеља и заштитника удовица и сиротих, чувара целомудрија, кротког васпитача деце, окрепљење стараца, наставника постника, одмор трудбеника, изобилно богатство ништих и убогих. Услиши нас који ти се молимо и под окриље твоје прибегавамо, заузми се за нас пред Вишњим, и својим богопријатним молитвама измоли нам све што је корисно по спасење душа и тела наших. Помоћу твојом сачувај од сваке невоље свету обитељ ову, сваки град и село, и сваку хришћанску земљу, и људе што у њима живе, јер знамо, знамо да молитва праведнога може много помоћи на добро, а после преблагословене Дјеве Марије ми тебе праведника имамо као заступника пред свемилостивим Богом, и твоме усрдном посредништву и заступништву смирено прибегавамо . Преблаги оче, ти нас, као будни и добри пастир, сачувај од свих непријатеља, погибије, земљотреса, града, глади, поплаве, пожара, покоља, најезде туђинаца. И у свим нашим опасностима и невољама пружај нам руку помоћи, и отвори нам врата милосрђа Божјег, јер смо због мноштва неправди наших недостојни гледати висину небеску, оковани смо оковима греха, те никада не сатворисмо вољу Створитеља нашег, нити одржасмо заповести Његове. Тога ради преклањамо пред Творцем нашим колена скрушеног и смиреног срца нашег, и просимо твоје очинско посредовање пред Њим, помози нам, угодниче Божји, да не изгинемо са безакоњима нашим, избави нас од сваког зла и од сваке напасти, упути ум наш, и укрепи срце наше у правој вери, да бисмо твојим посредовањем и заузимањем остали непотамањени ни ранама, ни опасностима, ни помором, нити икаквим гневом Саздатеља нашег. И да тако у миру проживимо овдашњи живот, и удостојимо се видети добра на земљи живих, славећи Оца и Сина и Светога Духа, Једног у Тројици слављеног и обожаваног Бога, сада и увек и кроза све векове, Амин.\n\nМОЛИТВА ДРУГА СВЕТОМ НИКОЛАЈУ\n\nО, свесвети Николаје, прекрасни угодниче Господњи, наш усрдни заступниче, и свуда у невољама брзи помоћниче, помози мени грешном и утученом у овом садашњем животу, умоли Господа Бога да ми опрости све грехе моје које од младости своје починих у целом животу мом, делом, речју, мишљу и свим чулима својим, и при исходу душе моје помози мени кукавном, умоли Господа Бога, Саздатеља свих твари, да ме избави ваздушних митарстава и вечних мука, како бих свагда прослављао Оца и Сина и Светога Духа, и твоје милостиво посредовање, сада и увек и кроза све векове. Амин.\n\nМОЛИТВА ТРЕЋА СВЕТОМ НИКОЛАЈУ\n\nО, свеблаги оче Николаје, пастиру и учитељу свих који са вером прибегавају твоме заступништву, и усрдном те молитвом призивају, брзо похитај, и избави стадо Христово од вукова који га растржу, и светим молитвама својим огради и сачувај сваку хришћанску земљу од побуна, земљотреса, најезде туђинаца и међусобног рата, од глади, поплаве, пожара, покоља и изненадне смрти, и као што си се смиловао на три човека што су били у тамници, и избавио их од царева гнева и посечења мачем, тако се смилуј и на мене који сам у тами грехова умом, речју и делом, и избави ме од гнева Божјег и вечне казне, да би ми, због твог посредовања и помоћи, и због Свога милосрђа и помоћи, Христос Бог подарио да тих и безгрешан живот проживим у овом свету, и да ме избави стајања с леве стране, а удостоји са свима светима стајања с десне стране. Амин.", "О, света мученице Марина, ти си била живи огањ вере у Господа Исуса Христа и због те вере си радосно и без страха пострадала и удостојила се да добијеш венац мучеништва од Самог Господа. Твојим светим подвигом, ти си за сва времена показала да се могу победити наши највећи непријатељи спасења - тело и ђаво. Зато ти је Господ подарио велику благодатну моћ да нам помажеш у многим невољама, а посебно у борби са злим демонским силама. Због тога, ми свегрешни и немоћни приступамо ти, света Марина, и просимо твоју благодатну помоћ. Помози нам да и ми победимо наше тело, које нас на безброј начина вара и коме у сваком захтеву попуштамо грешећи непрестано. Својим молитвама Господу учини да устанемо из блата у којем се ваљамо и да се очистимо од свих телесних нечистоћа кроз дубоко и искрено покајање, како би могли да поставимо добар почетак на путу спасења. Али те још више молимо да нам помогнеш у овој тешкој и крвавој невидљивој борби, коју водимо са духовима злобе и који су нас преварили и увукли у многе грехе, а да често тога ми нисмо ни свесни. Зато својим светим молитвама са Небеских висина одагнај све демоне који плету замке око нас и одводе са пута спасења. Они су својом злобом и лукавошћу у нама посејали и гордост, и себичност, и мржњу, и завист, и злобу, и властољубље, и сластољубље, и среброљубље и све друге страсти које су се у нама одомаћиле и постале као нека друга наша природа. Зато својом огњеном молитвом, мученице Марина, одагнај све те бесове који су се устремили на нас и помози да и ми устанемо против њих једним новим животом кроз Цркву Христову, кроз покајање, кроз врлински и непорочан живот. Помози да се у нама распали неугасиви огањ љубави Божије, којом си ти тако силно горела, па да трепетом бдимо над сваким својим делом и мишљу и да душу оградимо непрестаном молитвом и Богомислијем. Тада ће демони бежати од нас са страхом и неће моћи много да нам нашкоде. Нека би твојим светим молитвама тако поживели до краја земног живота стремећи ка Вишњем свету. А када једном са душама пређемо у царство духова, помози да слободни прођемо крај злих војски сатанских и да се удостојимо да са радошћу уђемо у светлост Царства Небеског, где све војске Анђела и свих Светих међу којима и ти лучезарно светлиш, света Марина, непрестано славе Пресвету и Животворну Тројицу, Оца и Сина и Светога Духа, сада и увек и у векове векова. Амин.", "О свештена главо, славни Чудотворче, Светитељу Христов Саво, првопрестониче Српске земље, хранитељу и просветитељу, благонадежни предстатељу свих хришћана пред Господом, теби припадамо и молимо се: дај нам да будемо учесници твоје љубави према Богу и ближњему, којом је душа твоја испуњена била за живота.\nОзари нас истином, просвети разум и срце наше светлошћу божанске науке, научи нас теби верно подражавати, Бога и ближњега љубити, и заповести Господње вршити непогрешно, те да будемо и ми чеда твоја не само по имену но целим животом својим.\nМоли се, свети Архијереју, за Свету православну Цркву и за Отаџбину своју земаљску која те увек с љубављу поштује. Призри благодушно на сваку душу твојих верних чада, који траже милост твоју и помоћ. Буди нам свима у болестима исцелитељ, у тузи исцелитељ, у жалости посетитељ, у бедама и уждама помоћник, а на смртном часу милостив покровитељ и заштитник да би помоћу твојих светих молитава и ми грешни удостојили се примити право спасење и наследити Царство Христово.\nО свече Божји, не постиди нашу душу коју на тебе силно полажемо, но јави нам своје многомоћно заступање, те да славимо и величамо Бога, дивнога у Светим Својим, Оца и Сина и Светога Духа, сада и увек и у векове векова. Амин.", "Свети Василије, велики угодниче Божији, помози свима па и мени. Велики бранитељу вере Православне, одбрани и нас који твоју Свету веру држимо, и с надом теби приступамо. Велики архијереју Божији, помоли се Богу Сведржитељу за све људе твоје, па на послетку и за мене недостојног и последњег. Тврдошки витеже и Острошки подвижниче, спасавај нас од беда видљивих и невидљивих. Запалила те је Српска земља као вечну свећу пред престолом Бога Живога, па нам сада осветли путеве и разагнај тугу. Молитвама и сузама загревао си хладну пештеру Острошку, па загреј сада Божијим духом и срца наша, да се спасемо и прославимо Бога свевишњега и тебе Свеца Божијега. Са свих страна света притицали су ћивоту твоме болни и невољни, и ти си им помагао: демоне одгонио, везе ђавоље раскидао, и здравље душевно и телесно људима даривао. Тако и сада помози, крштеним и некрштеним, као и увек, свима па и мени. Измиритељ си био завађене браће, измири и сада све завађене, збратими разбраћене, овесели тужне, укроти самовољне, исцели болне. Свети Василије Чудотворче и Оче наш духовни, чуј и услиши чеда твоја духовна у Христу Исусу Господу нашем. Амин."

        };
    }
}
