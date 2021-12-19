package com.p2082ss.android.ugc.aweme.beauty;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.beauty.ComposerBeautyExtra */
public final class ComposerBeautyExtra {
    public static final C34802a Companion = new C34802a((byte) 0);
    @AbstractC27891c(mo46611a = "ab_group")
    private final int abGroup;
    @AbstractC27891c(mo46611a = "beautify")
    private String beautify;
    @AbstractC27891c(mo46611a = "beautyConfig")
    private String beautyConfig;
    @AbstractC27891c(mo46611a = "blush_default")
    private final Float blushDefault;
    @AbstractC27891c(mo46611a = "blush_max")
    private final Float blushMax;
    @AbstractC27891c(mo46611a = "default")

    /* renamed from: default  reason: not valid java name */
    private final boolean f205070default;
    @AbstractC27891c(mo46611a = "disable_cache")
    private boolean disableCache;
    @AbstractC27891c(mo46611a = "eye_default")
    private final Float eyeDefault;
    @AbstractC27891c(mo46611a = "eye_max")
    private final Float eyeMax;
    @AbstractC27891c(mo46611a = "face_default")
    private final Float faceDefault;
    @AbstractC27891c(mo46611a = "face_max")
    private final Float faceMax;
    private final String gender;
    @AbstractC27891c(mo46611a = "is_none")
    private boolean isNone;
    @AbstractC27891c(mo46611a = "lipstick_default")
    private final Float lipstickDefault;
    @AbstractC27891c(mo46611a = "lipstick_max")
    private final Float lipstickMax;
    @AbstractC27891c(mo46611a = "liveeffectid")
    private String liveEffectId;
    @AbstractC27891c(mo46611a = "MakeupType")
    private int makeupType;
    private String resourceType;
    @AbstractC27891c(mo46611a = "sharp_default")
    private final Float sharpDefault;
    @AbstractC27891c(mo46611a = "sharp_max")
    private final Float sharpMax;
    @AbstractC27891c(mo46611a = "skin_default")
    private final Float skinDefault;
    @AbstractC27891c(mo46611a = "skin_max")
    private final Float skinMax;
    @AbstractC27891c(mo46611a = "testliveeffectid")
    private String testLiveEffectId;
    @AbstractC27891c(mo46611a = "video_tag")
    private String videoTag;

    static {
        Covode.recordClassIndex(41802);
    }

    public ComposerBeautyExtra() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, null, null, false, false, 0, null, null, null, 16777215, null);
    }

    /* renamed from: com.ss.android.ugc.aweme.beauty.ComposerBeautyExtra$a */
    public static final class C34802a {
        static {
            Covode.recordClassIndex(41803);
        }

        private C34802a() {
        }

        public /* synthetic */ C34802a(byte b) {
            this();
        }
    }

    public final int getAbGroup() {
        return this.abGroup;
    }

    public final String getBeautify() {
        return this.beautify;
    }

    public final String getBeautyConfig() {
        return this.beautyConfig;
    }

    public final Float getBlushDefault() {
        return this.blushDefault;
    }

    public final Float getBlushMax() {
        return this.blushMax;
    }

    public final boolean getDefault() {
        return this.f205070default;
    }

    public final boolean getDisableCache() {
        return this.disableCache;
    }

    public final Float getEyeDefault() {
        return this.eyeDefault;
    }

    public final Float getEyeMax() {
        return this.eyeMax;
    }

    public final Float getFaceDefault() {
        return this.faceDefault;
    }

    public final Float getFaceMax() {
        return this.faceMax;
    }

    public final String getGender() {
        return this.gender;
    }

    public final Float getLipstickDefault() {
        return this.lipstickDefault;
    }

    public final Float getLipstickMax() {
        return this.lipstickMax;
    }

    public final String getLiveEffectId() {
        return this.liveEffectId;
    }

    public final int getMakeupType() {
        return this.makeupType;
    }

    public final String getResourceType() {
        return this.resourceType;
    }

    public final Float getSharpDefault() {
        return this.sharpDefault;
    }

    public final Float getSharpMax() {
        return this.sharpMax;
    }

    public final Float getSkinDefault() {
        return this.skinDefault;
    }

    public final Float getSkinMax() {
        return this.skinMax;
    }

    public final String getTestLiveEffectId() {
        return this.testLiveEffectId;
    }

    public final String getVideoTag() {
        return this.videoTag;
    }

    public final boolean isNone() {
        return this.isNone;
    }

    public final void setBeautify(String str) {
        this.beautify = str;
    }

    public final void setBeautyConfig(String str) {
        this.beautyConfig = str;
    }

    public final void setDisableCache(boolean z) {
        this.disableCache = z;
    }

    public final void setLiveEffectId(String str) {
        this.liveEffectId = str;
    }

    public final void setMakeupType(int i) {
        this.makeupType = i;
    }

    public final void setNone(boolean z) {
        this.isNone = z;
    }

    public final void setTestLiveEffectId(String str) {
        this.testLiveEffectId = str;
    }

    public final void setVideoTag(String str) {
        this.videoTag = str;
    }

    public final void setResourceType(String str) {
        C89219l.m154721d(str, "");
        this.resourceType = str;
    }

    public ComposerBeautyExtra(String str, String str2, Float f, Float f2, Float f3, Float f4, Float f5, Float f6, Float f7, Float f8, Float f9, Float f10, Float f11, Float f12, int i, boolean z, String str3, String str4, boolean z2, boolean z3, int i2, String str5, String str6, String str7) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.resourceType = str;
        this.gender = str2;
        this.lipstickDefault = f;
        this.lipstickMax = f2;
        this.blushDefault = f3;
        this.blushMax = f4;
        this.eyeDefault = f5;
        this.eyeMax = f6;
        this.faceDefault = f7;
        this.faceMax = f8;
        this.skinDefault = f9;
        this.skinMax = f10;
        this.sharpDefault = f11;
        this.sharpMax = f12;
        this.abGroup = i;
        this.f205070default = z;
        this.beautify = str3;
        this.beautyConfig = str4;
        this.isNone = z2;
        this.disableCache = z3;
        this.makeupType = i2;
        this.videoTag = str5;
        this.liveEffectId = str6;
        this.testLiveEffectId = str7;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ComposerBeautyExtra(java.lang.String r27, java.lang.String r28, java.lang.Float r29, java.lang.Float r30, java.lang.Float r31, java.lang.Float r32, java.lang.Float r33, java.lang.Float r34, java.lang.Float r35, java.lang.Float r36, java.lang.Float r37, java.lang.Float r38, java.lang.Float r39, java.lang.Float r40, int r41, boolean r42, java.lang.String r43, java.lang.String r44, boolean r45, boolean r46, int r47, java.lang.String r48, java.lang.String r49, java.lang.String r50, int r51, p4600h.p4611f.p4613b.C89214g r52) {
        /*
        // Method dump skipped, instructions count: 200
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.beauty.ComposerBeautyExtra.<init>(java.lang.String, java.lang.String, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, int, boolean, java.lang.String, java.lang.String, boolean, boolean, int, java.lang.String, java.lang.String, java.lang.String, int, h.f.b.g):void");
    }
}
