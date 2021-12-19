package com.p2082ss.android.ugc.aweme.story.edit.clip.impl;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.story.base.p4022c.C76617a;
import com.p2082ss.android.ugc.aweme.story.edit.clip.p4042a.AbstractC77119c;
import com.p2082ss.android.ugc.aweme.story.edit.clip.p4042a.AbstractC77129h;
import com.p2082ss.android.ugc.aweme.story.edit.clip.p4042a.C77118b;
import com.p2082ss.android.ugc.aweme.story.edit.clip.p4042a.EnumC77124e;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.edit.clip.impl.VEEditClipCluster */
public final class VEEditClipCluster implements AbstractC77119c<VEEditClip>, AbstractC77129h<VEEditClip>, AbstractC77129h {

    /* renamed from: a */
    public final Map<String, VEEditClip> f172997a;

    /* renamed from: b */
    public final C77137d f172998b;

    /* renamed from: c */
    private final LiveData<VEEditClip> f172999c;

    /* renamed from: d */
    private final LiveData<C89378p<VEEditClip, Boolean>> f173000d;

    /* renamed from: e */
    private final AbstractC1204m f173001e;

    static {
        Covode.recordClassIndex(90138);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.edit.clip.p4042a.AbstractC77119c
    public final List<VEEditClip> getClips() {
        return this.f172998b.getClips();
    }

    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            destroy();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.edit.clip.p4042a.AbstractC77129h
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ AbstractC77119c mo120639a() {
        return this.f172998b;
    }

    @Override // com.p2082ss.android.ugc.aweme.story.edit.clip.p4042a.AbstractC77129h
    /* renamed from: b */
    public final LiveData<VEEditClip> mo120641b() {
        return this.f172999c;
    }

    @Override // com.p2082ss.android.ugc.aweme.story.edit.clip.p4042a.AbstractC77129h
    /* renamed from: c */
    public final LiveData<C89378p<VEEditClip, Boolean>> mo120642c() {
        return this.f173000d;
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void destroy() {
        for (VEEditClip vEEditClip : mo120639a().getClips()) {
            m134727a(vEEditClip, EnumC77124e.DESTROYED);
        }
        this.f172998b.f173003a.clear();
    }

    public /* synthetic */ VEEditClipCluster(AbstractC1204m mVar) {
        this(mVar, new C77137d());
    }

    /* renamed from: b */
    private final void m134728b(VEEditClip vEEditClip) {
        vEEditClip.mo120646d();
        C76617a.m134204a(this.f172999c, vEEditClip);
        C76617a.m134204a(this.f173000d, C89387v.m154943a(vEEditClip, true));
    }

    /* renamed from: c */
    private final void m134729c(VEEditClip vEEditClip) {
        vEEditClip.mo120647e();
        C76617a.m134204a(this.f173000d, C89387v.m154943a(vEEditClip, false));
    }

    /* renamed from: a */
    public final void mo120640a(VEEditClip vEEditClip) {
        if (!C89219l.m154714a(vEEditClip, C77118b.m134706a(this))) {
            VEEditClip vEEditClip2 = (VEEditClip) C77118b.m134706a(this);
            if (vEEditClip2 != null) {
                m134727a(vEEditClip2, EnumC77124e.CREATED);
            }
            m134727a(vEEditClip, EnumC77124e.LOADED);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.p2082ss.android.ugc.aweme.story.edit.clip.p4042a.AbstractC77119c
    public final /* synthetic */ void add(VEEditClip vEEditClip, int i) {
        VEEditClip vEEditClip2 = vEEditClip;
        C89219l.m154721d(vEEditClip2, "");
        this.f172998b.add(vEEditClip2, i);
        this.f172997a.put(vEEditClip2.f172984g.getClipId(), vEEditClip2);
    }

    private VEEditClipCluster(AbstractC1204m mVar, C77137d dVar) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(dVar, "");
        this.f173001e = mVar;
        this.f172998b = dVar;
        this.f172997a = new LinkedHashMap();
        this.f172999c = new C1213t();
        this.f173000d = new C1213t();
        mVar.getLifecycle().mo4012a(this);
    }

    /* renamed from: a */
    private final void m134727a(VEEditClip vEEditClip, EnumC77124e eVar) {
        if (vEEditClip != null && vEEditClip.f172980c != EnumC77124e.DESTROYED) {
            int i = C77136c.f173002a[eVar.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (vEEditClip.f172980c.compareTo((Enum) EnumC77124e.LOADED) >= 0) {
                            m134729c(vEEditClip);
                        }
                        if (vEEditClip.f172980c.compareTo((Enum) EnumC77124e.CREATED) >= 0) {
                            vEEditClip.mo120648f();
                        }
                    }
                } else if (vEEditClip.f172980c.compareTo((Enum) EnumC77124e.LOADED) < 0) {
                    if (vEEditClip.f172980c.compareTo((Enum) EnumC77124e.CREATED) < 0) {
                        vEEditClip.mo120645c();
                    }
                    m134728b(vEEditClip);
                }
            } else if (vEEditClip.f172980c.compareTo((Enum) EnumC77124e.CREATED) < 0) {
                vEEditClip.mo120645c();
            } else if (vEEditClip.f172980c.compareTo((Enum) EnumC77124e.CREATED) > 0) {
                m134729c(vEEditClip);
            }
        }
    }
}
