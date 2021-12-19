package com.p2082ss.android.ugc.aweme.shortvideo;

import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.TimeSpeedModelExtension;
import com.p2082ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p2082ss.android.ugc.aweme.tools.EnumC78601i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.dt */
public final class C70650dt extends ArrayList<TimeSpeedModelExtension> {

    /* renamed from: a */
    transient EnumC78601i f158133a;

    /* renamed from: b */
    transient FaceStickerBean f158134b;

    /* renamed from: c */
    transient List<AVChallenge> f158135c;

    /* renamed from: d */
    transient int f158136d = -1;

    /* renamed from: e */
    private BeautyMetadata f158137e;

    /* renamed from: f */
    private String f158138f;

    /* renamed from: g */
    private transient int f158139g = -1;

    /* renamed from: h */
    private transient int f158140h = -1;

    /* renamed from: i */
    private float f158141i = -1.0f;

    /* renamed from: j */
    private boolean f158142j;

    /* renamed from: k */
    private int f158143k;

    /* renamed from: l */
    private boolean f158144l;
    public String segmentBeginTime;

    static {
        Covode.recordClassIndex(83116);
    }

    public C70650dt() {
    }

    public final void removeLast() {
        remove(size() - 1);
    }

    public C70650dt(Collection<? extends TimeSpeedModelExtension> collection) {
        super(collection);
    }

    public final long end(long j, Bundle bundle) {
        return end(j, null, null, null, null, null, null, bundle);
    }

    public final void begin(EnumC78601i iVar, Bundle bundle) {
        this.f158133a = iVar;
        this.f158134b = (FaceStickerBean) bundle.getParcelable("currentSticker");
        this.f158142j = bundle.getBoolean("is_uploadtype_sticker");
        this.f158143k = bundle.getInt("upload_type_sticker_media_size");
        this.f158144l = bundle.getBoolean("is_texttype_sticker");
        this.f158135c = bundle.getParcelableArrayList("currentChallenge");
        this.f158136d = bundle.getInt("cameraId", -1);
        this.f158137e = (BeautyMetadata) bundle.getSerializable("beautyMetadata");
        this.f158138f = bundle.getString("cameraLensInfo");
        this.segmentBeginTime = String.valueOf(SystemClock.elapsedRealtime());
        this.f158139g = bundle.getInt("tabOrder", -1);
        this.f158140h = bundle.getInt("imprPosition", -1);
        this.f158141i = bundle.getFloat("effect_intensity", -1.0f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
        if (r12 != false) goto L_0x004b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x020b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long end(long r42, com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.EmbaddedWindowInfo r44, java.util.List<java.lang.String> r45, java.util.List<java.lang.String> r46, com.p2082ss.android.ugc.aweme.sticker.SavePhotoStickerInfo r47, com.p2082ss.android.ugc.aweme.sticker.model.C75439a r48, java.lang.String r49, android.os.Bundle r50) {
        /*
        // Method dump skipped, instructions count: 549
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.C70650dt.end(long, com.ss.android.ugc.aweme.shortvideo.ui.EmbaddedWindowInfo, java.util.List, java.util.List, com.ss.android.ugc.aweme.sticker.SavePhotoStickerInfo, com.ss.android.ugc.aweme.sticker.model.a, java.lang.String, android.os.Bundle):long");
    }
}
