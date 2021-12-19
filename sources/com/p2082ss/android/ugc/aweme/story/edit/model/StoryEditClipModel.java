package com.p2082ss.android.ugc.aweme.story.edit.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.p2082ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.p2082ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.p2082ss.android.ugc.aweme.effect.EffectPointModel;
import com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.C69744c;
import com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.p2082ss.android.ugc.aweme.story.record.recordcontrol.StoryWorkspaceImpl;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.edit.model.StoryEditClipModel */
public final class StoryEditClipModel implements Parcelable, Serializable {
    public static final C77144a CREATOR = new C77144a((byte) 0);

    /* renamed from: A */
    private String f173015A;

    /* renamed from: B */
    private String f173016B;

    /* renamed from: C */
    private List<String> f173017C;

    /* renamed from: D */
    private List<String> f173018D;

    /* renamed from: E */
    private CanvasVideoData f173019E;

    /* renamed from: F */
    private HashMap<String, String> f173020F;

    /* renamed from: G */
    private ArrayList<String> f173021G;

    /* renamed from: H */
    private final String f173022H;

    /* renamed from: I */
    private final EditPreviewInfo f173023I;

    /* renamed from: J */
    private final int f173024J;

    /* renamed from: K */
    private final int f173025K;

    /* renamed from: L */
    private final String f173026L;

    /* renamed from: a */
    private final AbstractC89244h f173027a;

    /* renamed from: b */
    private String f173028b;

    /* renamed from: c */
    private float f173029c;

    /* renamed from: d */
    private float f173030d;

    /* renamed from: e */
    private CoverPublishModel f173031e;

    /* renamed from: f */
    private boolean f173032f;

    /* renamed from: g */
    private int f173033g;

    /* renamed from: h */
    private int f173034h;

    /* renamed from: i */
    private int f173035i;

    /* renamed from: j */
    private int f173036j;

    /* renamed from: k */
    private int f173037k;

    /* renamed from: l */
    private String f173038l;

    /* renamed from: m */
    private String f173039m;

    /* renamed from: n */
    private String f173040n;

    /* renamed from: o */
    private String f173041o;

    /* renamed from: p */
    private String f173042p;

    /* renamed from: q */
    private float f173043q;

    /* renamed from: r */
    private String f173044r;

    /* renamed from: s */
    private String f173045s;

    /* renamed from: t */
    private String f173046t;

    /* renamed from: u */
    private ArrayList<EffectPointModel> f173047u;

    /* renamed from: v */
    private StoryEditMusicModel f173048v;

    /* renamed from: w */
    private String f173049w;

    /* renamed from: x */
    private String f173050x;

    /* renamed from: y */
    private InfoStickerModel f173051y;

    /* renamed from: z */
    private MultiEditVideoStatusRecordData f173052z;

    static {
        Covode.recordClassIndex(90149);
    }

    public final int describeContents() {
        return 0;
    }

    public final Workspace getWorkspace() {
        return (Workspace) this.f173027a.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.model.StoryEditClipModel$a */
    public static final class C77144a implements Parcelable.Creator<StoryEditClipModel> {
        static {
            Covode.recordClassIndex(90150);
        }

        private C77144a() {
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ StoryEditClipModel[] newArray(int i) {
            return new StoryEditClipModel[i];
        }

        public /* synthetic */ C77144a(byte b) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ StoryEditClipModel createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new StoryEditClipModel(parcel);
        }
    }

    public final String getAiMusicRequestTaskId() {
        return this.f173050x;
    }

    public final ArrayList<String> getCacheFileList() {
        return this.f173021G;
    }

    public final CanvasVideoData getCanvasVideoData() {
        return this.f173019E;
    }

    public final String getClipId() {
        return this.f173026L;
    }

    public final CoverPublishModel getCoverPublishModel() {
        return this.f173031e;
    }

    public final String getCreationId() {
        return this.f173028b;
    }

    public final StoryEditMusicModel getEditMusicModel() {
        return this.f173048v;
    }

    public final ArrayList<EffectPointModel> getEffectList() {
        return this.f173047u;
    }

    public final String getEncodedAudioOutputFile() {
        return this.f173046t;
    }

    public final List<String> getHashTagTextList() {
        return this.f173018D;
    }

    public final String getMCurFilterIds() {
        return this.f173039m;
    }

    public final String getMCurFilterLabels() {
        return this.f173038l;
    }

    public final String getMSelectedFilterId() {
        return this.f173041o;
    }

    public final float getMSelectedFilterIntensity() {
        return this.f173043q;
    }

    public final String getMSelectedFilterLabel() {
        return this.f173040n;
    }

    public final String getMSelectedFilterResId() {
        return this.f173042p;
    }

    public final String getMainBusinessContextStr() {
        return this.f173049w;
    }

    public final List<String> getMentionTextList() {
        return this.f173017C;
    }

    public final MultiEditVideoStatusRecordData getMultiEditVideoRecordData() {
        return this.f173052z;
    }

    public final float getMusicVolume() {
        return this.f173030d;
    }

    public final int getOutVideoHeight() {
        return this.f173034h;
    }

    public final int getOutVideoWidth() {
        return this.f173033g;
    }

    public final String getOutputFile() {
        return this.f173044r;
    }

    public final String getParallelUploadOutputFile() {
        return this.f173045s;
    }

    public final EditPreviewInfo getPreviewMediaInfo() {
        return this.f173023I;
    }

    public final int getSelectFilterIndex() {
        return this.f173037k;
    }

    public final String getSessionId() {
        return this.f173022H;
    }

    public final int getSourceContentType() {
        return this.f173025K;
    }

    public final HashMap<String, String> getStickerCacheDirMap() {
        return this.f173020F;
    }

    public final String getTextEffectIds() {
        return this.f173016B;
    }

    public final String getTextTypes() {
        return this.f173015A;
    }

    public final int getVideoCanvasHeight() {
        return this.f173036j;
    }

    public final int getVideoCanvasWidth() {
        return this.f173035i;
    }

    public final int getVideoEditorType() {
        return this.f173024J;
    }

    public final float getVoiceVolume() {
        return this.f173029c;
    }

    public final boolean isFastImport() {
        return this.f173032f;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.model.StoryEditClipModel$b */
    static final class C77145b extends AbstractC89220m implements AbstractC89171a<Workspace> {

        /* renamed from: a */
        final /* synthetic */ StoryEditClipModel f173053a;

        static {
            Covode.recordClassIndex(90151);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77145b(StoryEditClipModel storyEditClipModel) {
            super(0);
            this.f173053a = storyEditClipModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Workspace invoke() {
            return C69744c.m123267a(new StoryWorkspaceImpl(this.f173053a.getSessionId()));
        }
    }

    public final InfoStickerModel getInfoStickerModel() {
        if (this.f173051y == null) {
            this.f173051y = new InfoStickerModel(C77148a.m134751a(this));
        }
        return this.f173051y;
    }

    public final void setAiMusicRequestTaskId(String str) {
        this.f173050x = str;
    }

    public final void setCanvasVideoData(CanvasVideoData canvasVideoData) {
        this.f173019E = canvasVideoData;
    }

    public final void setEffectList(ArrayList<EffectPointModel> arrayList) {
        this.f173047u = arrayList;
    }

    public final void setFastImport(boolean z) {
        this.f173032f = z;
    }

    public final void setHashTagTextList(List<String> list) {
        this.f173018D = list;
    }

    public final void setInfoStickerModel(InfoStickerModel infoStickerModel) {
        this.f173051y = infoStickerModel;
    }

    public final void setMCurFilterIds(String str) {
        this.f173039m = str;
    }

    public final void setMCurFilterLabels(String str) {
        this.f173038l = str;
    }

    public final void setMSelectedFilterId(String str) {
        this.f173041o = str;
    }

    public final void setMSelectedFilterIntensity(float f) {
        this.f173043q = f;
    }

    public final void setMSelectedFilterLabel(String str) {
        this.f173040n = str;
    }

    public final void setMSelectedFilterResId(String str) {
        this.f173042p = str;
    }

    public final void setMainBusinessContextStr(String str) {
        this.f173049w = str;
    }

    public final void setMentionTextList(List<String> list) {
        this.f173017C = list;
    }

    public final void setMultiEditVideoRecordData(MultiEditVideoStatusRecordData multiEditVideoStatusRecordData) {
        this.f173052z = multiEditVideoStatusRecordData;
    }

    public final void setMusicVolume(float f) {
        this.f173030d = f;
    }

    public final void setOutVideoHeight(int i) {
        this.f173034h = i;
    }

    public final void setOutVideoWidth(int i) {
        this.f173033g = i;
    }

    public final void setSelectFilterIndex(int i) {
        this.f173037k = i;
    }

    public final void setVideoCanvasHeight(int i) {
        this.f173036j = i;
    }

    public final void setVideoCanvasWidth(int i) {
        this.f173035i = i;
    }

    public final void setVoiceVolume(float f) {
        this.f173029c = f;
    }

    public final void setCoverPublishModel(CoverPublishModel coverPublishModel) {
        C89219l.m154721d(coverPublishModel, "");
        this.f173031e = coverPublishModel;
    }

    public final void setCreationId(String str) {
        C89219l.m154721d(str, "");
        this.f173028b = str;
    }

    public final void setEditMusicModel(StoryEditMusicModel storyEditMusicModel) {
        C89219l.m154721d(storyEditMusicModel, "");
        this.f173048v = storyEditMusicModel;
    }

    public final void setEncodedAudioOutputFile(String str) {
        C89219l.m154721d(str, "");
        this.f173046t = str;
    }

    public final void setOutputFile(String str) {
        C89219l.m154721d(str, "");
        this.f173044r = str;
    }

    public final void setParallelUploadOutputFile(String str) {
        C89219l.m154721d(str, "");
        this.f173045s = str;
    }

    public final void setStickerCacheDirMap(HashMap<String, String> hashMap) {
        C89219l.m154721d(hashMap, "");
        this.f173020F = hashMap;
    }

    public final void setTextEffectIds(String str) {
        C89219l.m154721d(str, "");
        this.f173016B = str;
    }

    public final void setTextTypes(String str) {
        C89219l.m154721d(str, "");
        this.f173015A = str;
    }

    public final void addCacheFile(String str) {
        C89219l.m154721d(str, "");
        this.f173021G.add(str);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public StoryEditClipModel(android.os.Parcel r21) {
        /*
        // Method dump skipped, instructions count: 416
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.edit.model.StoryEditClipModel.<init>(android.os.Parcel):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.f173022H);
        parcel.writeParcelable(this.f173023I, i);
        parcel.writeInt(this.f173024J);
        parcel.writeInt(this.f173025K);
        parcel.writeString(this.f173026L);
        parcel.writeString(this.f173028b);
        parcel.writeFloat(this.f173029c);
        parcel.writeFloat(this.f173030d);
        parcel.writeParcelable(this.f173031e, i);
        parcel.writeByte(this.f173032f ? (byte) 1 : 0);
        parcel.writeInt(this.f173033g);
        parcel.writeInt(this.f173034h);
        parcel.writeInt(this.f173035i);
        parcel.writeInt(this.f173036j);
        parcel.writeInt(this.f173037k);
        parcel.writeString(this.f173038l);
        parcel.writeString(this.f173039m);
        parcel.writeString(this.f173041o);
        parcel.writeString(this.f173040n);
        parcel.writeString(this.f173042p);
        parcel.writeFloat(this.f173043q);
        parcel.writeString(this.f173044r);
        parcel.writeString(this.f173045s);
        parcel.writeString(this.f173046t);
        parcel.writeTypedList(this.f173047u);
        parcel.writeParcelable(this.f173048v, i);
        parcel.writeParcelable(getInfoStickerModel(), i);
        parcel.writeString(this.f173049w);
        parcel.writeString(this.f173050x);
        parcel.writeParcelable(this.f173052z, i);
        parcel.writeString(this.f173015A);
        parcel.writeString(this.f173016B);
        parcel.writeStringList(this.f173017C);
        parcel.writeStringList(this.f173018D);
        parcel.writeSerializable(this.f173019E);
        parcel.writeSerializable(this.f173020F);
        parcel.writeStringList(this.f173021G);
    }

    public StoryEditClipModel(String str, EditPreviewInfo editPreviewInfo, int i, int i2, String str2) {
        float f;
        C89219l.m154721d(editPreviewInfo, "");
        C89219l.m154721d(str2, "");
        this.f173022H = str;
        this.f173023I = editPreviewInfo;
        this.f173024J = i;
        this.f173025K = i2;
        this.f173026L = str2;
        this.f173027a = C89250i.m154773a((AbstractC89171a) new C77145b(this));
        this.f173028b = "";
        if (i2 == 2) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        this.f173029c = f;
        this.f173030d = 1.0f;
        this.f173031e = new CoverPublishModel(null, 0.0f, 0.0f, 0.0f, null, false, 0.0f, 0, false, null, null, 0, 0.0f, 0.0f, 16383, null);
        this.f173043q = -1.0f;
        File h = C69744c.m123266a().mo110099h();
        C89219l.m154716b(h, "");
        String path = h.getPath();
        C89219l.m154716b(path, "");
        this.f173044r = path;
        File j = getWorkspace().mo110101j();
        C89219l.m154716b(j, "");
        String path2 = j.getPath();
        C89219l.m154716b(path2, "");
        this.f173045s = path2;
        File i3 = getWorkspace().mo110100i();
        C89219l.m154716b(i3, "");
        String path3 = i3.getPath();
        C89219l.m154716b(path3, "");
        this.f173046t = path3;
        this.f173048v = new StoryEditMusicModel(null, null, null, 0, 0, 0, 0, 0, false, null, 1023, null);
        this.f173015A = "";
        this.f173016B = "";
        this.f173020F = new HashMap<>();
        this.f173021G = new ArrayList<>();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StoryEditClipModel(String str, EditPreviewInfo editPreviewInfo, int i, int i2, String str2, int i3, C89214g gVar) {
        this(str, editPreviewInfo, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 1 : i2, (i3 & 16) != 0 ? String.valueOf(SystemClock.elapsedRealtimeNanos()) : str2);
    }
}
