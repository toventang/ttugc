package com.bytedance.nita.api;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.nita.api.AbstractC21525c;
import com.bytedance.nita.p1558f.AbstractC21563b;
import com.bytedance.nita.p1558f.C21562a;
import java.util.ArrayList;
import java.util.Collection;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.nita.api.d */
public abstract class AbstractC21527d implements AbstractC21525c {

    /* renamed from: d */
    public final ArrayList<Integer> f51111d = new ArrayList<>();

    static {
        Covode.recordClassIndex(25168);
    }

    @Override // com.bytedance.nita.api.AbstractC21525c
    /* renamed from: a */
    public void mo35188a(View view, Activity activity) {
        C89219l.m154719c(view, "");
        C89219l.m154719c(activity, "");
    }

    @Override // com.bytedance.nita.api.AbstractC21525c
    /* renamed from: b */
    public AbstractC21563b mo35179b() {
        return C21562a.f51167a;
    }

    @Override // com.bytedance.nita.api.AbstractC21525c
    /* renamed from: f */
    public final EnumC21530g mo35194f() {
        return EnumC21530g.ACTIVITY_DESTORY;
    }

    @Override // com.bytedance.nita.api.AbstractC21525c
    /* renamed from: g */
    public final EnumC21529f mo35195g() {
        return EnumC21529f.SINGLE;
    }

    @Override // com.bytedance.nita.api.AbstractC21525c
    /* renamed from: d */
    public final int[] mo35193d() {
        return C89070n.m154578e((Collection<Integer>) this.f51111d);
    }

    @Override // com.bytedance.nita.api.AbstractC21525c
    /* renamed from: b */
    public final ViewGroup mo35192b(Context context) {
        C89219l.m154719c(context, "");
        return AbstractC21525c.C21526a.m40463a(context);
    }
}
