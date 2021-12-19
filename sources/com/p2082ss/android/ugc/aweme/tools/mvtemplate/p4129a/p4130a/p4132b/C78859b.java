package com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4132b;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f;
import com.p2082ss.android.ugc.aweme.services.upload.IPhotoPreDownloadMusic;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.C78899d;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4131a.AbstractC78852b;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4131a.AbstractC78853c;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.a.b.b */
public final class C78859b {

    /* renamed from: a */
    public String f177244a;

    /* renamed from: b */
    public MusicModel f177245b;

    /* renamed from: c */
    public boolean f177246c;

    /* renamed from: d */
    public IPhotoPreDownloadMusic f177247d;

    /* renamed from: e */
    public boolean f177248e;

    /* renamed from: f */
    public final C78899d f177249f;

    /* renamed from: g */
    public WeakReference<Activity> f177250g;

    /* renamed from: h */
    public AbstractC78853c f177251h;

    /* renamed from: i */
    public AbstractC78852b f177252i;

    /* renamed from: j */
    public List<String> f177253j;

    /* renamed from: k */
    public String f177254k;

    /* renamed from: l */
    public AbstractC46415f f177255l;

    /* renamed from: m */
    public String f177256m;

    /* renamed from: n */
    public MusicModel f177257n;

    static {
        Covode.recordClassIndex(92008);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C78859b(C78899d dVar, WeakReference weakReference, AbstractC78853c cVar, AbstractC78852b bVar, List list, String str, int i) {
        this(dVar, (i & 2) != 0 ? null : weakReference, (i & 4) != 0 ? null : cVar, (i & 8) != 0 ? null : bVar, (i & 16) != 0 ? null : list, (i & 32) == 0 ? str : null, null, null);
    }

    public C78859b(C78899d dVar, WeakReference<Activity> weakReference, AbstractC78853c cVar, AbstractC78852b bVar, List<String> list, String str, String str2, MusicModel musicModel) {
        this.f177249f = dVar;
        this.f177250g = weakReference;
        this.f177251h = cVar;
        this.f177252i = bVar;
        this.f177253j = list;
        this.f177254k = str;
        this.f177255l = null;
        this.f177256m = str2;
        this.f177257n = musicModel;
        this.f177246c = true;
    }
}
