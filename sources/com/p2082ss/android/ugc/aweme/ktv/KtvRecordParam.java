package com.p2082ss.android.ugc.aweme.ktv;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ktv.KtvRecordParam */
public final class KtvRecordParam implements Serializable {
    private boolean adjustedStickerPosition;
    private List<Integer> audioDurations;
    private List<String> audioPaths;
    private int auditionDuration;
    private String author;
    private SimpleEffect authorEffect;
    private UrlModel coverLarge;
    private UrlModel coverMedium;
    private int delayByUser;
    private int duration;
    private String enterMethod;
    private SimpleEffect fontEffect;
    private ArrayList<Boolean> globalWiredHeadset;

    /* renamed from: id */
    private String f132189id;
    private SimpleEffect lyricEffect;
    private TreeMap<Integer, Object> lyricLines;
    private String lyricPath;
    private int lyricStartTime;
    private int lyricType;
    private UrlModel lyricUrl;
    private String musicId;
    private String musicSelectedFrom;
    private ArrayList<Integer> mvFileDurations;
    private ArrayList<String> mvFilePaths;
    private ArrayList<String> mvFileTypes;
    private String mvImageEffectPath;
    private int mvMode;
    private String mvVideoEffectPath;
    private SimpleEffect mvVideoResEffect;
    private boolean needFetchMusic;
    private KtvAudioParam originTrack;
    private String originTrackPath;
    private boolean processTuningSuccess;
    private Integer recordBGMDelay;
    private int recordMode;
    private ReverberationData reverberation;
    private int shootDuration;
    private boolean showAuthor;
    private KtvAudioParam subTrack;
    private String subTrackPath;
    private String title;
    private String tuningAudioOutputPath;
    private KtvAudioParam tuningAudioTrack;
    private String tuningMidiPath;
    private ReverberationData tuningReverberation;
    private boolean useRecommendVolume;
    private int videoDuration;
    private KtvAudioParam voiceTrack;
    private boolean wiredHeadset;

    static {
        Covode.recordClassIndex(68029);
    }

    public KtvRecordParam() {
        this(null, null, false, null, null, null, 0, null, false, null, null, null, null, null, null, null, 0, 0, 0, null, null, null, 0, 0, null, null, false, null, null, null, null, null, 0, null, null, null, null, 0, null, false, 0, false, null, null, null, false, null, null, null, -1, 131071, null);
    }

    public static /* synthetic */ KtvRecordParam copy$default(KtvRecordParam ktvRecordParam, String str, String str2, boolean z, String str3, String str4, String str5, int i, KtvAudioParam ktvAudioParam, boolean z2, Integer num, List list, List list2, KtvAudioParam ktvAudioParam2, String str6, KtvAudioParam ktvAudioParam3, String str7, int i2, int i3, int i4, UrlModel urlModel, TreeMap treeMap, String str8, int i5, int i6, UrlModel urlModel2, UrlModel urlModel3, boolean z3, SimpleEffect simpleEffect, SimpleEffect simpleEffect2, SimpleEffect simpleEffect3, String str9, String str10, int i7, SimpleEffect simpleEffect4, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i8, ReverberationData reverberationData, boolean z4, int i9, boolean z5, String str11, String str12, ArrayList arrayList4, boolean z6, KtvAudioParam ktvAudioParam4, String str13, ReverberationData reverberationData2, int i10, int i11, Object obj) {
        List<Integer> list3 = list2;
        List<String> list4 = list;
        String str14 = str3;
        boolean z7 = z;
        String str15 = str2;
        String str16 = str;
        String str17 = str4;
        String str18 = str5;
        int i12 = i;
        KtvAudioParam ktvAudioParam5 = ktvAudioParam;
        boolean z8 = z2;
        Integer num2 = num;
        String str19 = str13;
        KtvAudioParam ktvAudioParam6 = ktvAudioParam4;
        boolean z9 = z6;
        String str20 = str11;
        boolean z10 = z5;
        int i13 = i8;
        ArrayList<Integer> arrayList5 = arrayList3;
        ArrayList<String> arrayList6 = arrayList;
        SimpleEffect simpleEffect5 = simpleEffect4;
        String str21 = str8;
        TreeMap<Integer, Object> treeMap2 = treeMap;
        ReverberationData reverberationData3 = reverberationData2;
        int i14 = i7;
        ArrayList arrayList7 = arrayList4;
        int i15 = i3;
        int i16 = i4;
        ReverberationData reverberationData4 = reverberationData;
        KtvAudioParam ktvAudioParam7 = ktvAudioParam2;
        UrlModel urlModel4 = urlModel2;
        String str22 = str7;
        int i17 = i2;
        int i18 = i9;
        KtvAudioParam ktvAudioParam8 = ktvAudioParam3;
        ArrayList<String> arrayList8 = arrayList2;
        int i19 = i5;
        int i20 = i6;
        boolean z11 = z4;
        String str23 = str6;
        UrlModel urlModel5 = urlModel3;
        UrlModel urlModel6 = urlModel;
        String str24 = str10;
        boolean z12 = z3;
        SimpleEffect simpleEffect6 = simpleEffect;
        String str25 = str12;
        SimpleEffect simpleEffect7 = simpleEffect2;
        SimpleEffect simpleEffect8 = simpleEffect3;
        String str26 = str9;
        if ((i10 & 1) != 0) {
            str16 = ktvRecordParam.f132189id;
        }
        if ((i10 & 2) != 0) {
            str15 = ktvRecordParam.musicId;
        }
        if ((i10 & 4) != 0) {
            z7 = ktvRecordParam.needFetchMusic;
        }
        if ((i10 & 8) != 0) {
            str14 = ktvRecordParam.musicSelectedFrom;
        }
        if ((i10 & 16) != 0) {
            str17 = ktvRecordParam.title;
        }
        if ((i10 & 32) != 0) {
            str18 = ktvRecordParam.author;
        }
        if ((i10 & 64) != 0) {
            i12 = ktvRecordParam.recordMode;
        }
        if ((i10 & 128) != 0) {
            ktvAudioParam5 = ktvRecordParam.voiceTrack;
        }
        if ((i10 & 256) != 0) {
            z8 = ktvRecordParam.wiredHeadset;
        }
        if ((i10 & 512) != 0) {
            num2 = ktvRecordParam.recordBGMDelay;
        }
        if ((i10 & 1024) != 0) {
            list4 = ktvRecordParam.audioPaths;
        }
        if ((i10 & 2048) != 0) {
            list3 = ktvRecordParam.audioDurations;
        }
        if ((i10 & 4096) != 0) {
            ktvAudioParam7 = ktvRecordParam.originTrack;
        }
        if ((i10 & 8192) != 0) {
            str23 = ktvRecordParam.originTrackPath;
        }
        if ((i10 & 16384) != 0) {
            ktvAudioParam8 = ktvRecordParam.subTrack;
        }
        if ((i10 & 32768) != 0) {
            str22 = ktvRecordParam.subTrackPath;
        }
        if ((i10 & 65536) != 0) {
            i17 = ktvRecordParam.duration;
        }
        if ((131072 & i10) != 0) {
            i15 = ktvRecordParam.shootDuration;
        }
        if ((262144 & i10) != 0) {
            i16 = ktvRecordParam.auditionDuration;
        }
        if ((524288 & i10) != 0) {
            urlModel6 = ktvRecordParam.lyricUrl;
        }
        if ((1048576 & i10) != 0) {
            treeMap2 = ktvRecordParam.lyricLines;
        }
        if ((2097152 & i10) != 0) {
            str21 = ktvRecordParam.lyricPath;
        }
        if ((4194304 & i10) != 0) {
            i19 = ktvRecordParam.lyricType;
        }
        if ((8388608 & i10) != 0) {
            i20 = ktvRecordParam.lyricStartTime;
        }
        if ((16777216 & i10) != 0) {
            urlModel4 = ktvRecordParam.coverMedium;
        }
        if ((33554432 & i10) != 0) {
            urlModel5 = ktvRecordParam.coverLarge;
        }
        if ((67108864 & i10) != 0) {
            z12 = ktvRecordParam.showAuthor;
        }
        if ((134217728 & i10) != 0) {
            simpleEffect6 = ktvRecordParam.lyricEffect;
        }
        if ((268435456 & i10) != 0) {
            simpleEffect7 = ktvRecordParam.fontEffect;
        }
        if ((536870912 & i10) != 0) {
            simpleEffect8 = ktvRecordParam.authorEffect;
        }
        if ((1073741824 & i10) != 0) {
            str26 = ktvRecordParam.mvVideoEffectPath;
        }
        if ((i10 & Integer.MIN_VALUE) != 0) {
            str24 = ktvRecordParam.mvImageEffectPath;
        }
        if ((i11 & 1) != 0) {
            i14 = ktvRecordParam.mvMode;
        }
        if ((i11 & 2) != 0) {
            simpleEffect5 = ktvRecordParam.mvVideoResEffect;
        }
        if ((i11 & 4) != 0) {
            arrayList6 = ktvRecordParam.mvFilePaths;
        }
        if ((i11 & 8) != 0) {
            arrayList8 = ktvRecordParam.mvFileTypes;
        }
        if ((i11 & 16) != 0) {
            arrayList5 = ktvRecordParam.mvFileDurations;
        }
        if ((i11 & 32) != 0) {
            i13 = ktvRecordParam.videoDuration;
        }
        if ((i11 & 64) != 0) {
            reverberationData4 = ktvRecordParam.reverberation;
        }
        if ((i11 & 128) != 0) {
            z11 = ktvRecordParam.useRecommendVolume;
        }
        if ((i11 & 256) != 0) {
            i18 = ktvRecordParam.delayByUser;
        }
        if ((i11 & 512) != 0) {
            z10 = ktvRecordParam.adjustedStickerPosition;
        }
        if ((i11 & 1024) != 0) {
            str20 = ktvRecordParam.enterMethod;
        }
        if ((i11 & 2048) != 0) {
            str25 = ktvRecordParam.tuningMidiPath;
        }
        if ((i11 & 4096) != 0) {
            arrayList7 = ktvRecordParam.globalWiredHeadset;
        }
        if ((i11 & 8192) != 0) {
            z9 = ktvRecordParam.processTuningSuccess;
        }
        if ((i11 & 16384) != 0) {
            ktvAudioParam6 = ktvRecordParam.tuningAudioTrack;
        }
        if ((i11 & 32768) != 0) {
            str19 = ktvRecordParam.tuningAudioOutputPath;
        }
        if ((i11 & 65536) != 0) {
            reverberationData3 = ktvRecordParam.tuningReverberation;
        }
        return ktvRecordParam.copy(str16, str15, z7, str14, str17, str18, i12, ktvAudioParam5, z8, num2, list4, list3, ktvAudioParam7, str23, ktvAudioParam8, str22, i17, i15, i16, urlModel6, treeMap2, str21, i19, i20, urlModel4, urlModel5, z12, simpleEffect6, simpleEffect7, simpleEffect8, str26, str24, i14, simpleEffect5, arrayList6, arrayList8, arrayList5, i13, reverberationData4, z11, i18, z10, str20, str25, arrayList7, z9, ktvAudioParam6, str19, reverberationData3);
    }

    public final String component1() {
        return this.f132189id;
    }

    public final Integer component10() {
        return this.recordBGMDelay;
    }

    public final List<String> component11() {
        return this.audioPaths;
    }

    public final List<Integer> component12() {
        return this.audioDurations;
    }

    public final KtvAudioParam component13() {
        return this.originTrack;
    }

    public final String component14() {
        return this.originTrackPath;
    }

    public final KtvAudioParam component15() {
        return this.subTrack;
    }

    public final String component16() {
        return this.subTrackPath;
    }

    public final int component17() {
        return this.duration;
    }

    public final int component18() {
        return this.shootDuration;
    }

    public final int component19() {
        return this.auditionDuration;
    }

    public final String component2() {
        return this.musicId;
    }

    public final UrlModel component20() {
        return this.lyricUrl;
    }

    public final TreeMap<Integer, Object> component21() {
        return this.lyricLines;
    }

    public final String component22() {
        return this.lyricPath;
    }

    public final int component23() {
        return this.lyricType;
    }

    public final int component24() {
        return this.lyricStartTime;
    }

    public final UrlModel component25() {
        return this.coverMedium;
    }

    public final UrlModel component26() {
        return this.coverLarge;
    }

    public final boolean component27() {
        return this.showAuthor;
    }

    public final SimpleEffect component28() {
        return this.lyricEffect;
    }

    public final SimpleEffect component29() {
        return this.fontEffect;
    }

    public final boolean component3() {
        return this.needFetchMusic;
    }

    public final SimpleEffect component30() {
        return this.authorEffect;
    }

    public final String component31() {
        return this.mvVideoEffectPath;
    }

    public final String component32() {
        return this.mvImageEffectPath;
    }

    public final int component33() {
        return this.mvMode;
    }

    public final SimpleEffect component34() {
        return this.mvVideoResEffect;
    }

    public final ArrayList<String> component35() {
        return this.mvFilePaths;
    }

    public final ArrayList<String> component36() {
        return this.mvFileTypes;
    }

    public final ArrayList<Integer> component37() {
        return this.mvFileDurations;
    }

    public final int component38() {
        return this.videoDuration;
    }

    public final ReverberationData component39() {
        return this.reverberation;
    }

    public final String component4() {
        return this.musicSelectedFrom;
    }

    public final boolean component40() {
        return this.useRecommendVolume;
    }

    public final int component41() {
        return this.delayByUser;
    }

    public final boolean component42() {
        return this.adjustedStickerPosition;
    }

    public final String component43() {
        return this.enterMethod;
    }

    public final String component44() {
        return this.tuningMidiPath;
    }

    public final ArrayList<Boolean> component45() {
        return this.globalWiredHeadset;
    }

    public final boolean component46() {
        return this.processTuningSuccess;
    }

    public final KtvAudioParam component47() {
        return this.tuningAudioTrack;
    }

    public final String component48() {
        return this.tuningAudioOutputPath;
    }

    public final ReverberationData component49() {
        return this.tuningReverberation;
    }

    public final String component5() {
        return this.title;
    }

    public final String component6() {
        return this.author;
    }

    public final int component7() {
        return this.recordMode;
    }

    public final KtvAudioParam component8() {
        return this.voiceTrack;
    }

    public final boolean component9() {
        return this.wiredHeadset;
    }

    public final KtvRecordParam copy(String str, String str2, boolean z, String str3, String str4, String str5, int i, KtvAudioParam ktvAudioParam, boolean z2, Integer num, List<String> list, List<Integer> list2, KtvAudioParam ktvAudioParam2, String str6, KtvAudioParam ktvAudioParam3, String str7, int i2, int i3, int i4, UrlModel urlModel, TreeMap<Integer, Object> treeMap, String str8, int i5, int i6, UrlModel urlModel2, UrlModel urlModel3, boolean z3, SimpleEffect simpleEffect, SimpleEffect simpleEffect2, SimpleEffect simpleEffect3, String str9, String str10, int i7, SimpleEffect simpleEffect4, ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<Integer> arrayList3, int i8, ReverberationData reverberationData, boolean z4, int i9, boolean z5, String str11, String str12, ArrayList<Boolean> arrayList4, boolean z6, KtvAudioParam ktvAudioParam4, String str13, ReverberationData reverberationData2) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        C89219l.m154721d(arrayList, "");
        C89219l.m154721d(arrayList2, "");
        C89219l.m154721d(arrayList3, "");
        C89219l.m154721d(arrayList4, "");
        return new KtvRecordParam(str, str2, z, str3, str4, str5, i, ktvAudioParam, z2, num, list, list2, ktvAudioParam2, str6, ktvAudioParam3, str7, i2, i3, i4, urlModel, treeMap, str8, i5, i6, urlModel2, urlModel3, z3, simpleEffect, simpleEffect2, simpleEffect3, str9, str10, i7, simpleEffect4, arrayList, arrayList2, arrayList3, i8, reverberationData, z4, i9, z5, str11, str12, arrayList4, z6, ktvAudioParam4, str13, reverberationData2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KtvRecordParam)) {
            return false;
        }
        KtvRecordParam ktvRecordParam = (KtvRecordParam) obj;
        return C89219l.m154714a(this.f132189id, ktvRecordParam.f132189id) && C89219l.m154714a(this.musicId, ktvRecordParam.musicId) && this.needFetchMusic == ktvRecordParam.needFetchMusic && C89219l.m154714a(this.musicSelectedFrom, ktvRecordParam.musicSelectedFrom) && C89219l.m154714a(this.title, ktvRecordParam.title) && C89219l.m154714a(this.author, ktvRecordParam.author) && this.recordMode == ktvRecordParam.recordMode && C89219l.m154714a(this.voiceTrack, ktvRecordParam.voiceTrack) && this.wiredHeadset == ktvRecordParam.wiredHeadset && C89219l.m154714a(this.recordBGMDelay, ktvRecordParam.recordBGMDelay) && C89219l.m154714a(this.audioPaths, ktvRecordParam.audioPaths) && C89219l.m154714a(this.audioDurations, ktvRecordParam.audioDurations) && C89219l.m154714a(this.originTrack, ktvRecordParam.originTrack) && C89219l.m154714a(this.originTrackPath, ktvRecordParam.originTrackPath) && C89219l.m154714a(this.subTrack, ktvRecordParam.subTrack) && C89219l.m154714a(this.subTrackPath, ktvRecordParam.subTrackPath) && this.duration == ktvRecordParam.duration && this.shootDuration == ktvRecordParam.shootDuration && this.auditionDuration == ktvRecordParam.auditionDuration && C89219l.m154714a(this.lyricUrl, ktvRecordParam.lyricUrl) && C89219l.m154714a(this.lyricLines, ktvRecordParam.lyricLines) && C89219l.m154714a(this.lyricPath, ktvRecordParam.lyricPath) && this.lyricType == ktvRecordParam.lyricType && this.lyricStartTime == ktvRecordParam.lyricStartTime && C89219l.m154714a(this.coverMedium, ktvRecordParam.coverMedium) && C89219l.m154714a(this.coverLarge, ktvRecordParam.coverLarge) && this.showAuthor == ktvRecordParam.showAuthor && C89219l.m154714a(this.lyricEffect, ktvRecordParam.lyricEffect) && C89219l.m154714a(this.fontEffect, ktvRecordParam.fontEffect) && C89219l.m154714a(this.authorEffect, ktvRecordParam.authorEffect) && C89219l.m154714a(this.mvVideoEffectPath, ktvRecordParam.mvVideoEffectPath) && C89219l.m154714a(this.mvImageEffectPath, ktvRecordParam.mvImageEffectPath) && this.mvMode == ktvRecordParam.mvMode && C89219l.m154714a(this.mvVideoResEffect, ktvRecordParam.mvVideoResEffect) && C89219l.m154714a(this.mvFilePaths, ktvRecordParam.mvFilePaths) && C89219l.m154714a(this.mvFileTypes, ktvRecordParam.mvFileTypes) && C89219l.m154714a(this.mvFileDurations, ktvRecordParam.mvFileDurations) && this.videoDuration == ktvRecordParam.videoDuration && C89219l.m154714a(this.reverberation, ktvRecordParam.reverberation) && this.useRecommendVolume == ktvRecordParam.useRecommendVolume && this.delayByUser == ktvRecordParam.delayByUser && this.adjustedStickerPosition == ktvRecordParam.adjustedStickerPosition && C89219l.m154714a(this.enterMethod, ktvRecordParam.enterMethod) && C89219l.m154714a(this.tuningMidiPath, ktvRecordParam.tuningMidiPath) && C89219l.m154714a(this.globalWiredHeadset, ktvRecordParam.globalWiredHeadset) && this.processTuningSuccess == ktvRecordParam.processTuningSuccess && C89219l.m154714a(this.tuningAudioTrack, ktvRecordParam.tuningAudioTrack) && C89219l.m154714a(this.tuningAudioOutputPath, ktvRecordParam.tuningAudioOutputPath) && C89219l.m154714a(this.tuningReverberation, ktvRecordParam.tuningReverberation);
    }

    public final int hashCode() {
        String str = this.f132189id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.musicId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.needFetchMusic;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode2 + i3) * 31;
        String str3 = this.musicSelectedFrom;
        int hashCode3 = (i6 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.title;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.author;
        int hashCode5 = (((hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.recordMode) * 31;
        KtvAudioParam ktvAudioParam = this.voiceTrack;
        int hashCode6 = (hashCode5 + (ktvAudioParam != null ? ktvAudioParam.hashCode() : 0)) * 31;
        boolean z2 = this.wiredHeadset;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (hashCode6 + i7) * 31;
        Integer num = this.recordBGMDelay;
        int hashCode7 = (i10 + (num != null ? num.hashCode() : 0)) * 31;
        List<String> list = this.audioPaths;
        int hashCode8 = (hashCode7 + (list != null ? list.hashCode() : 0)) * 31;
        List<Integer> list2 = this.audioDurations;
        int hashCode9 = (hashCode8 + (list2 != null ? list2.hashCode() : 0)) * 31;
        KtvAudioParam ktvAudioParam2 = this.originTrack;
        int hashCode10 = (hashCode9 + (ktvAudioParam2 != null ? ktvAudioParam2.hashCode() : 0)) * 31;
        String str6 = this.originTrackPath;
        int hashCode11 = (hashCode10 + (str6 != null ? str6.hashCode() : 0)) * 31;
        KtvAudioParam ktvAudioParam3 = this.subTrack;
        int hashCode12 = (hashCode11 + (ktvAudioParam3 != null ? ktvAudioParam3.hashCode() : 0)) * 31;
        String str7 = this.subTrackPath;
        int hashCode13 = (((((((hashCode12 + (str7 != null ? str7.hashCode() : 0)) * 31) + this.duration) * 31) + this.shootDuration) * 31) + this.auditionDuration) * 31;
        UrlModel urlModel = this.lyricUrl;
        int hashCode14 = (hashCode13 + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        TreeMap<Integer, Object> treeMap = this.lyricLines;
        int hashCode15 = (hashCode14 + (treeMap != null ? treeMap.hashCode() : 0)) * 31;
        String str8 = this.lyricPath;
        int hashCode16 = (((((hashCode15 + (str8 != null ? str8.hashCode() : 0)) * 31) + this.lyricType) * 31) + this.lyricStartTime) * 31;
        UrlModel urlModel2 = this.coverMedium;
        int hashCode17 = (hashCode16 + (urlModel2 != null ? urlModel2.hashCode() : 0)) * 31;
        UrlModel urlModel3 = this.coverLarge;
        int hashCode18 = (hashCode17 + (urlModel3 != null ? urlModel3.hashCode() : 0)) * 31;
        boolean z3 = this.showAuthor;
        if (z3) {
            z3 = true;
        }
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = (hashCode18 + i11) * 31;
        SimpleEffect simpleEffect = this.lyricEffect;
        int hashCode19 = (i14 + (simpleEffect != null ? simpleEffect.hashCode() : 0)) * 31;
        SimpleEffect simpleEffect2 = this.fontEffect;
        int hashCode20 = (hashCode19 + (simpleEffect2 != null ? simpleEffect2.hashCode() : 0)) * 31;
        SimpleEffect simpleEffect3 = this.authorEffect;
        int hashCode21 = (hashCode20 + (simpleEffect3 != null ? simpleEffect3.hashCode() : 0)) * 31;
        String str9 = this.mvVideoEffectPath;
        int hashCode22 = (hashCode21 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.mvImageEffectPath;
        int hashCode23 = (((hashCode22 + (str10 != null ? str10.hashCode() : 0)) * 31) + this.mvMode) * 31;
        SimpleEffect simpleEffect4 = this.mvVideoResEffect;
        int hashCode24 = (hashCode23 + (simpleEffect4 != null ? simpleEffect4.hashCode() : 0)) * 31;
        ArrayList<String> arrayList = this.mvFilePaths;
        int hashCode25 = (hashCode24 + (arrayList != null ? arrayList.hashCode() : 0)) * 31;
        ArrayList<String> arrayList2 = this.mvFileTypes;
        int hashCode26 = (hashCode25 + (arrayList2 != null ? arrayList2.hashCode() : 0)) * 31;
        ArrayList<Integer> arrayList3 = this.mvFileDurations;
        int hashCode27 = (((hashCode26 + (arrayList3 != null ? arrayList3.hashCode() : 0)) * 31) + this.videoDuration) * 31;
        ReverberationData reverberationData = this.reverberation;
        int hashCode28 = (hashCode27 + (reverberationData != null ? reverberationData.hashCode() : 0)) * 31;
        boolean z4 = this.useRecommendVolume;
        if (z4) {
            z4 = true;
        }
        int i15 = z4 ? 1 : 0;
        int i16 = z4 ? 1 : 0;
        int i17 = z4 ? 1 : 0;
        int i18 = (((hashCode28 + i15) * 31) + this.delayByUser) * 31;
        boolean z5 = this.adjustedStickerPosition;
        if (z5) {
            z5 = true;
        }
        int i19 = z5 ? 1 : 0;
        int i20 = z5 ? 1 : 0;
        int i21 = z5 ? 1 : 0;
        int i22 = (i18 + i19) * 31;
        String str11 = this.enterMethod;
        int hashCode29 = (i22 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.tuningMidiPath;
        int hashCode30 = (hashCode29 + (str12 != null ? str12.hashCode() : 0)) * 31;
        ArrayList<Boolean> arrayList4 = this.globalWiredHeadset;
        int hashCode31 = (hashCode30 + (arrayList4 != null ? arrayList4.hashCode() : 0)) * 31;
        if (!this.processTuningSuccess) {
            i2 = 0;
        }
        int i23 = (hashCode31 + i2) * 31;
        KtvAudioParam ktvAudioParam4 = this.tuningAudioTrack;
        int hashCode32 = (i23 + (ktvAudioParam4 != null ? ktvAudioParam4.hashCode() : 0)) * 31;
        String str13 = this.tuningAudioOutputPath;
        int hashCode33 = (hashCode32 + (str13 != null ? str13.hashCode() : 0)) * 31;
        ReverberationData reverberationData2 = this.tuningReverberation;
        if (reverberationData2 != null) {
            i = reverberationData2.hashCode();
        }
        return hashCode33 + i;
    }

    public final String toString() {
        return "KtvRecordParam(id=" + this.f132189id + ", musicId=" + this.musicId + ", needFetchMusic=" + this.needFetchMusic + ", musicSelectedFrom=" + this.musicSelectedFrom + ", title=" + this.title + ", author=" + this.author + ", recordMode=" + this.recordMode + ", voiceTrack=" + this.voiceTrack + ", wiredHeadset=" + this.wiredHeadset + ", recordBGMDelay=" + this.recordBGMDelay + ", audioPaths=" + this.audioPaths + ", audioDurations=" + this.audioDurations + ", originTrack=" + this.originTrack + ", originTrackPath=" + this.originTrackPath + ", subTrack=" + this.subTrack + ", subTrackPath=" + this.subTrackPath + ", duration=" + this.duration + ", shootDuration=" + this.shootDuration + ", auditionDuration=" + this.auditionDuration + ", lyricUrl=" + this.lyricUrl + ", lyricLines=" + this.lyricLines + ", lyricPath=" + this.lyricPath + ", lyricType=" + this.lyricType + ", lyricStartTime=" + this.lyricStartTime + ", coverMedium=" + this.coverMedium + ", coverLarge=" + this.coverLarge + ", showAuthor=" + this.showAuthor + ", lyricEffect=" + this.lyricEffect + ", fontEffect=" + this.fontEffect + ", authorEffect=" + this.authorEffect + ", mvVideoEffectPath=" + this.mvVideoEffectPath + ", mvImageEffectPath=" + this.mvImageEffectPath + ", mvMode=" + this.mvMode + ", mvVideoResEffect=" + this.mvVideoResEffect + ", mvFilePaths=" + this.mvFilePaths + ", mvFileTypes=" + this.mvFileTypes + ", mvFileDurations=" + this.mvFileDurations + ", videoDuration=" + this.videoDuration + ", reverberation=" + this.reverberation + ", useRecommendVolume=" + this.useRecommendVolume + ", delayByUser=" + this.delayByUser + ", adjustedStickerPosition=" + this.adjustedStickerPosition + ", enterMethod=" + this.enterMethod + ", tuningMidiPath=" + this.tuningMidiPath + ", globalWiredHeadset=" + this.globalWiredHeadset + ", processTuningSuccess=" + this.processTuningSuccess + ", tuningAudioTrack=" + this.tuningAudioTrack + ", tuningAudioOutputPath=" + this.tuningAudioOutputPath + ", tuningReverberation=" + this.tuningReverberation + ")";
    }

    public final boolean getAdjustedStickerPosition() {
        return this.adjustedStickerPosition;
    }

    public final List<Integer> getAudioDurations() {
        return this.audioDurations;
    }

    public final List<String> getAudioPaths() {
        return this.audioPaths;
    }

    public final int getAuditionDuration() {
        return this.auditionDuration;
    }

    public final String getAuthor() {
        return this.author;
    }

    public final SimpleEffect getAuthorEffect() {
        return this.authorEffect;
    }

    public final UrlModel getCoverLarge() {
        return this.coverLarge;
    }

    public final UrlModel getCoverMedium() {
        return this.coverMedium;
    }

    public final int getDelayByUser() {
        return this.delayByUser;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final SimpleEffect getFontEffect() {
        return this.fontEffect;
    }

    public final ArrayList<Boolean> getGlobalWiredHeadset() {
        return this.globalWiredHeadset;
    }

    public final String getId() {
        return this.f132189id;
    }

    public final SimpleEffect getLyricEffect() {
        return this.lyricEffect;
    }

    public final TreeMap<Integer, Object> getLyricLines() {
        return this.lyricLines;
    }

    public final String getLyricPath() {
        return this.lyricPath;
    }

    public final int getLyricStartTime() {
        return this.lyricStartTime;
    }

    public final int getLyricType() {
        return this.lyricType;
    }

    public final UrlModel getLyricUrl() {
        return this.lyricUrl;
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final String getMusicSelectedFrom() {
        return this.musicSelectedFrom;
    }

    public final ArrayList<Integer> getMvFileDurations() {
        return this.mvFileDurations;
    }

    public final ArrayList<String> getMvFilePaths() {
        return this.mvFilePaths;
    }

    public final ArrayList<String> getMvFileTypes() {
        return this.mvFileTypes;
    }

    public final String getMvImageEffectPath() {
        return this.mvImageEffectPath;
    }

    public final int getMvMode() {
        return this.mvMode;
    }

    public final String getMvVideoEffectPath() {
        return this.mvVideoEffectPath;
    }

    public final SimpleEffect getMvVideoResEffect() {
        return this.mvVideoResEffect;
    }

    public final boolean getNeedFetchMusic() {
        return this.needFetchMusic;
    }

    public final KtvAudioParam getOriginTrack() {
        return this.originTrack;
    }

    public final String getOriginTrackPath() {
        return this.originTrackPath;
    }

    public final boolean getProcessTuningSuccess() {
        return this.processTuningSuccess;
    }

    public final Integer getRecordBGMDelay() {
        return this.recordBGMDelay;
    }

    public final int getRecordMode() {
        return this.recordMode;
    }

    public final ReverberationData getReverberation() {
        return this.reverberation;
    }

    public final int getShootDuration() {
        return this.shootDuration;
    }

    public final boolean getShowAuthor() {
        return this.showAuthor;
    }

    public final KtvAudioParam getSubTrack() {
        return this.subTrack;
    }

    public final String getSubTrackPath() {
        return this.subTrackPath;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTuningAudioOutputPath() {
        return this.tuningAudioOutputPath;
    }

    public final KtvAudioParam getTuningAudioTrack() {
        return this.tuningAudioTrack;
    }

    public final String getTuningMidiPath() {
        return this.tuningMidiPath;
    }

    public final ReverberationData getTuningReverberation() {
        return this.tuningReverberation;
    }

    public final boolean getUseRecommendVolume() {
        return this.useRecommendVolume;
    }

    public final int getVideoDuration() {
        return this.videoDuration;
    }

    public final KtvAudioParam getVoiceTrack() {
        return this.voiceTrack;
    }

    public final boolean getWiredHeadset() {
        return this.wiredHeadset;
    }

    private final boolean checkTuningMidiFile() {
        if (this.tuningAudioTrack == null || C84902i.m145892a(this.tuningMidiPath)) {
            return true;
        }
        return false;
    }

    public final List<AudioInterval> accompanimentTimeIntervals() {
        KtvAudioParam ktvAudioParam = this.subTrack;
        if (ktvAudioParam != null) {
            return ktvAudioParam.getTimeList();
        }
        return null;
    }

    public final List<AudioInterval> originalTimeIntervals() {
        KtvAudioParam ktvAudioParam = this.originTrack;
        if (ktvAudioParam != null) {
            return ktvAudioParam.getTimeList();
        }
        return null;
    }

    public final boolean checkFiles() {
        if (!C84902i.m145892a(this.originTrackPath) || !C84902i.m145892a(this.subTrackPath) || !C84902i.m145892a(this.lyricPath) || !checkTuningMidiFile()) {
            return false;
        }
        return true;
    }

    public final void setAdjustedStickerPosition(boolean z) {
        this.adjustedStickerPosition = z;
    }

    public final void setAuditionDuration(int i) {
        this.auditionDuration = i;
    }

    public final void setAuthor(String str) {
        this.author = str;
    }

    public final void setAuthorEffect(SimpleEffect simpleEffect) {
        this.authorEffect = simpleEffect;
    }

    public final void setCoverLarge(UrlModel urlModel) {
        this.coverLarge = urlModel;
    }

    public final void setCoverMedium(UrlModel urlModel) {
        this.coverMedium = urlModel;
    }

    public final void setDelayByUser(int i) {
        this.delayByUser = i;
    }

    public final void setDuration(int i) {
        this.duration = i;
    }

    public final void setEnterMethod(String str) {
        this.enterMethod = str;
    }

    public final void setFontEffect(SimpleEffect simpleEffect) {
        this.fontEffect = simpleEffect;
    }

    public final void setId(String str) {
        this.f132189id = str;
    }

    public final void setLyricEffect(SimpleEffect simpleEffect) {
        this.lyricEffect = simpleEffect;
    }

    public final void setLyricLines(TreeMap<Integer, Object> treeMap) {
        this.lyricLines = treeMap;
    }

    public final void setLyricPath(String str) {
        this.lyricPath = str;
    }

    public final void setLyricStartTime(int i) {
        this.lyricStartTime = i;
    }

    public final void setLyricType(int i) {
        this.lyricType = i;
    }

    public final void setLyricUrl(UrlModel urlModel) {
        this.lyricUrl = urlModel;
    }

    public final void setMusicId(String str) {
        this.musicId = str;
    }

    public final void setMusicSelectedFrom(String str) {
        this.musicSelectedFrom = str;
    }

    public final void setMvImageEffectPath(String str) {
        this.mvImageEffectPath = str;
    }

    public final void setMvMode(int i) {
        this.mvMode = i;
    }

    public final void setMvVideoEffectPath(String str) {
        this.mvVideoEffectPath = str;
    }

    public final void setMvVideoResEffect(SimpleEffect simpleEffect) {
        this.mvVideoResEffect = simpleEffect;
    }

    public final void setNeedFetchMusic(boolean z) {
        this.needFetchMusic = z;
    }

    public final void setOriginTrack(KtvAudioParam ktvAudioParam) {
        this.originTrack = ktvAudioParam;
    }

    public final void setOriginTrackPath(String str) {
        this.originTrackPath = str;
    }

    public final void setProcessTuningSuccess(boolean z) {
        this.processTuningSuccess = z;
    }

    public final void setRecordBGMDelay(Integer num) {
        this.recordBGMDelay = num;
    }

    public final void setRecordMode(int i) {
        this.recordMode = i;
    }

    public final void setReverberation(ReverberationData reverberationData) {
        this.reverberation = reverberationData;
    }

    public final void setShootDuration(int i) {
        this.shootDuration = i;
    }

    public final void setShowAuthor(boolean z) {
        this.showAuthor = z;
    }

    public final void setSubTrack(KtvAudioParam ktvAudioParam) {
        this.subTrack = ktvAudioParam;
    }

    public final void setSubTrackPath(String str) {
        this.subTrackPath = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setTuningAudioOutputPath(String str) {
        this.tuningAudioOutputPath = str;
    }

    public final void setTuningAudioTrack(KtvAudioParam ktvAudioParam) {
        this.tuningAudioTrack = ktvAudioParam;
    }

    public final void setTuningMidiPath(String str) {
        this.tuningMidiPath = str;
    }

    public final void setTuningReverberation(ReverberationData reverberationData) {
        this.tuningReverberation = reverberationData;
    }

    public final void setUseRecommendVolume(boolean z) {
        this.useRecommendVolume = z;
    }

    public final void setVideoDuration(int i) {
        this.videoDuration = i;
    }

    public final void setVoiceTrack(KtvAudioParam ktvAudioParam) {
        this.voiceTrack = ktvAudioParam;
    }

    public final void setWiredHeadset(boolean z) {
        this.wiredHeadset = z;
    }

    public final void setAudioDurations(List<Integer> list) {
        C89219l.m154721d(list, "");
        this.audioDurations = list;
    }

    public final void setAudioPaths(List<String> list) {
        C89219l.m154721d(list, "");
        this.audioPaths = list;
    }

    public final void setGlobalWiredHeadset(ArrayList<Boolean> arrayList) {
        C89219l.m154721d(arrayList, "");
        this.globalWiredHeadset = arrayList;
    }

    public final void setMvFileDurations(ArrayList<Integer> arrayList) {
        C89219l.m154721d(arrayList, "");
        this.mvFileDurations = arrayList;
    }

    public final void setMvFilePaths(ArrayList<String> arrayList) {
        C89219l.m154721d(arrayList, "");
        this.mvFilePaths = arrayList;
    }

    public final void setMvFileTypes(ArrayList<String> arrayList) {
        C89219l.m154721d(arrayList, "");
        this.mvFileTypes = arrayList;
    }

    public KtvRecordParam(String str, String str2, boolean z, String str3, String str4, String str5, int i, KtvAudioParam ktvAudioParam, boolean z2, Integer num, List<String> list, List<Integer> list2, KtvAudioParam ktvAudioParam2, String str6, KtvAudioParam ktvAudioParam3, String str7, int i2, int i3, int i4, UrlModel urlModel, TreeMap<Integer, Object> treeMap, String str8, int i5, int i6, UrlModel urlModel2, UrlModel urlModel3, boolean z3, SimpleEffect simpleEffect, SimpleEffect simpleEffect2, SimpleEffect simpleEffect3, String str9, String str10, int i7, SimpleEffect simpleEffect4, ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<Integer> arrayList3, int i8, ReverberationData reverberationData, boolean z4, int i9, boolean z5, String str11, String str12, ArrayList<Boolean> arrayList4, boolean z6, KtvAudioParam ktvAudioParam4, String str13, ReverberationData reverberationData2) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        C89219l.m154721d(arrayList, "");
        C89219l.m154721d(arrayList2, "");
        C89219l.m154721d(arrayList3, "");
        C89219l.m154721d(arrayList4, "");
        this.f132189id = str;
        this.musicId = str2;
        this.needFetchMusic = z;
        this.musicSelectedFrom = str3;
        this.title = str4;
        this.author = str5;
        this.recordMode = i;
        this.voiceTrack = ktvAudioParam;
        this.wiredHeadset = z2;
        this.recordBGMDelay = num;
        this.audioPaths = list;
        this.audioDurations = list2;
        this.originTrack = ktvAudioParam2;
        this.originTrackPath = str6;
        this.subTrack = ktvAudioParam3;
        this.subTrackPath = str7;
        this.duration = i2;
        this.shootDuration = i3;
        this.auditionDuration = i4;
        this.lyricUrl = urlModel;
        this.lyricLines = treeMap;
        this.lyricPath = str8;
        this.lyricType = i5;
        this.lyricStartTime = i6;
        this.coverMedium = urlModel2;
        this.coverLarge = urlModel3;
        this.showAuthor = z3;
        this.lyricEffect = simpleEffect;
        this.fontEffect = simpleEffect2;
        this.authorEffect = simpleEffect3;
        this.mvVideoEffectPath = str9;
        this.mvImageEffectPath = str10;
        this.mvMode = i7;
        this.mvVideoResEffect = simpleEffect4;
        this.mvFilePaths = arrayList;
        this.mvFileTypes = arrayList2;
        this.mvFileDurations = arrayList3;
        this.videoDuration = i8;
        this.reverberation = reverberationData;
        this.useRecommendVolume = z4;
        this.delayByUser = i9;
        this.adjustedStickerPosition = z5;
        this.enterMethod = str11;
        this.tuningMidiPath = str12;
        this.globalWiredHeadset = arrayList4;
        this.processTuningSuccess = z6;
        this.tuningAudioTrack = ktvAudioParam4;
        this.tuningAudioOutputPath = str13;
        this.tuningReverberation = reverberationData2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ KtvRecordParam(String str, String str2, boolean z, String str3, String str4, String str5, int i, KtvAudioParam ktvAudioParam, boolean z2, Integer num, List list, List list2, KtvAudioParam ktvAudioParam2, String str6, KtvAudioParam ktvAudioParam3, String str7, int i2, int i3, int i4, UrlModel urlModel, TreeMap treeMap, String str8, int i5, int i6, UrlModel urlModel2, UrlModel urlModel3, boolean z3, SimpleEffect simpleEffect, SimpleEffect simpleEffect2, SimpleEffect simpleEffect3, String str9, String str10, int i7, SimpleEffect simpleEffect4, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i8, ReverberationData reverberationData, boolean z4, int i9, boolean z5, String str11, String str12, ArrayList arrayList4, boolean z6, KtvAudioParam ktvAudioParam4, String str13, ReverberationData reverberationData2, int i10, int i11, C89214g gVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? false : z, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? null : str5, (i10 & 64) != 0 ? -1 : i, (i10 & 128) != 0 ? null : ktvAudioParam, (i10 & 256) != 0 ? false : z2, (i10 & 512) != 0 ? null : num, (i10 & 1024) != 0 ? new ArrayList() : list, (i10 & 2048) != 0 ? new ArrayList() : list2, (i10 & 4096) != 0 ? null : ktvAudioParam2, (i10 & 8192) != 0 ? null : str6, (i10 & 16384) != 0 ? null : ktvAudioParam3, (i10 & 32768) != 0 ? null : str7, (i10 & 65536) != 0 ? 0 : i2, (131072 & i10) != 0 ? 0 : i3, (262144 & i10) != 0 ? 0 : i4, (524288 & i10) != 0 ? null : urlModel, (1048576 & i10) != 0 ? null : treeMap, (2097152 & i10) != 0 ? null : str8, (4194304 & i10) != 0 ? 0 : i5, (8388608 & i10) != 0 ? 0 : i6, (16777216 & i10) != 0 ? null : urlModel2, (33554432 & i10) != 0 ? null : urlModel3, (67108864 & i10) != 0 ? false : z3, (134217728 & i10) != 0 ? null : simpleEffect, (268435456 & i10) != 0 ? null : simpleEffect2, (536870912 & i10) != 0 ? null : simpleEffect3, (1073741824 & i10) != 0 ? null : str9, (i10 & Integer.MIN_VALUE) != 0 ? null : str10, (i11 & 1) != 0 ? 0 : i7, (i11 & 2) != 0 ? null : simpleEffect4, (i11 & 4) != 0 ? new ArrayList() : arrayList, (i11 & 8) != 0 ? new ArrayList() : arrayList2, (i11 & 16) != 0 ? new ArrayList() : arrayList3, (i11 & 32) != 0 ? 0 : i8, (i11 & 64) != 0 ? null : reverberationData, (i11 & 128) != 0 ? true : z4, (i11 & 256) != 0 ? 0 : i9, (i11 & 512) != 0 ? false : z5, (i11 & 1024) != 0 ? null : str11, (i11 & 2048) != 0 ? null : str12, (i11 & 4096) != 0 ? new ArrayList() : arrayList4, (i11 & 8192) != 0 ? false : z6, (i11 & 16384) != 0 ? null : ktvAudioParam4, (i11 & 32768) != 0 ? null : str13, (i11 & 65536) != 0 ? null : reverberationData2);
    }
}
