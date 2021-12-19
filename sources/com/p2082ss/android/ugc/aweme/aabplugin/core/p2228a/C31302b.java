package com.p2082ss.android.ugc.aweme.aabplugin.core.p2228a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.p1542m.C21412d;
import com.bytedance.p1542m.p1543a.C21398a;
import com.bytedance.p1542m.p1543a.C21399b;
import com.bytedance.p1542m.p1544b.AbstractC21410b;
import com.bytedance.p1542m.p1544b.C21409a;
import com.google.android.play.core.p1966e.AbstractC27034f;
import com.p2082ss.android.ugc.aweme.aabplugin.core.base.AbstractC31333m;
import com.p2082ss.android.ugc.aweme.aabplugin.core.base.AbstractC31339n;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.aabplugin.core.a.b */
public final class C31302b extends AbstractC31333m<C31304d> implements AbstractC21410b {
    static {
        Covode.recordClassIndex(38002);
    }

    @Override // com.p2082ss.android.ugc.aweme.aabplugin.core.base.AbstractC31333m
    /* renamed from: a */
    public final void mo57301a() {
        T t = this.f75066g;
        this.f75063d.mo57324a();
        this.f75065f = false;
        this.f75068i = null;
        this.f75066g = null;
    }

    @Override // com.p2082ss.android.ugc.aweme.aabplugin.core.base.AbstractC31333m
    /* renamed from: b */
    public final void mo57303b() {
        C21412d.m40193a().f50802a.add(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.aabplugin.core.base.AbstractC31333m
    /* renamed from: c */
    public final void mo57306c() {
        C21412d.m40193a().f50802a.remove(this);
    }

    public C31302b(String str) {
        super(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ Object mo57305c(C21409a aVar) {
        mo57333b(aVar);
        return null;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.aabplugin.core.base.n] */
    @Override // com.p2082ss.android.ugc.aweme.aabplugin.core.base.AbstractC31333m
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo57302a(C31304d dVar) {
        T t = this.f75066g;
        this.f75066g = dVar;
        this.f75067h = this.f75060a;
        this.f75068i = null;
        dVar.mo57342a(AbstractC31339n.EnumC31342b.UNKNOWN);
    }

    @Override // com.bytedance.p1542m.p1544b.AbstractC21410b
    /* renamed from: a */
    public final void mo35014a(C21409a aVar) {
        T t = this.f75066g;
        if (t != null && TextUtils.equals(t.f75089m, aVar.f50788a)) {
            if (aVar.f50790c == 5 && !t.mo57311b()) {
                aVar.f50790c = 6;
                aVar.f50794g = 2;
            }
            C1731i.m5640b(new CallableC31303c(this, aVar), C1731i.f5562a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.aabplugin.core.base.AbstractC31333m
    /* renamed from: b */
    public final boolean mo57304b(ActivityC17312a aVar) {
        C21409a aVar2 = this.f75068i;
        if (aVar2 == null) {
            return false;
        }
        int i = this.f75062c;
        C21399b b = C21399b.m40170b();
        C21398a a = C21398a.m40167a();
        AbstractC27034f fVar = a.f50770a.get(aVar2.f50788a);
        if (fVar == null) {
            return false;
        }
        return b.f50774c.mo44707a(fVar, aVar, i);
    }
}
