package com.p2082ss.android.ugc.aweme.comment.api;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpreload.C17796c;
import com.bytedance.ies.powerpreload.p1245d.C17808a;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.app.p2322c.C33721c;
import com.p2082ss.android.ugc.aweme.comment.preload.CommentPreload;
import com.p2082ss.android.ugc.aweme.comment.preload.CommentPreloadRequest;
import com.p2082ss.android.ugc.aweme.preload.PreloadExtraInfo;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.comment.api.a */
public final /* synthetic */ class C36267a implements C17796c.AbstractC17800b {

    /* renamed from: a */
    private final String f85702a;

    /* renamed from: b */
    private final int f85703b;

    /* renamed from: c */
    private final String f85704c;

    /* renamed from: d */
    private final long f85705d = 0;

    /* renamed from: e */
    private final int f85706e = 20;

    /* renamed from: f */
    private final String f85707f = null;

    /* renamed from: g */
    private final String f85708g;

    /* renamed from: h */
    private final int f85709h;

    static {
        Covode.recordClassIndex(43542);
    }

    public C36267a(String str, int i, String str2, String str3, int i2) {
        this.f85702a = str;
        this.f85703b = i;
        this.f85704c = str2;
        this.f85708g = str3;
        this.f85709h = i2;
    }

    @Override // com.bytedance.ies.powerpreload.C17796c.AbstractC17800b
    /* renamed from: a */
    public final void mo28271a(C17808a aVar) {
        String str = this.f85702a;
        int i = this.f85703b;
        String str2 = this.f85704c;
        long j = this.f85705d;
        int i2 = this.f85706e;
        String str3 = this.f85707f;
        String str4 = this.f85708g;
        int i3 = this.f85709h;
        ArrayList arrayList = new ArrayList();
        arrayList.add("aweme_id");
        arrayList.add("cursor");
        CommentPreloadRequest a = CommentApi.m73900a(str2, j, i2, str3, (Long) null, C33721c.m69041a(str4), new PreloadExtraInfo(UGCMonitor.EVENT_COMMENT, str, "/aweme/v2/comment/list/", i, arrayList));
        Intent intent = new Intent();
        intent.putExtra("comment_preload_request", a);
        if (i3 != -1) {
            intent.putExtra("comment_ttl", i3);
        }
        aVar.mo28276a(CommentApi.m73892a(intent), CommentPreload.class);
    }
}
