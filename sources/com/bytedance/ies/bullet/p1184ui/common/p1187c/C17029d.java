package com.bytedance.ies.bullet.p1184ui.common.p1187c;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1184ui.common.p1187c.AbstractC17024b;
import com.bytedance.ies.bullet.service.base.C16614as;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.ui.common.c.d */
public final class C17029d<T extends View> {

    /* renamed from: a */
    public final T f40551a;

    /* renamed from: b */
    public final ViewGroup.LayoutParams f40552b;

    /* renamed from: c */
    private final Set<AbstractC17030e<T>> f40553c;

    static {
        Covode.recordClassIndex(19478);
    }

    /* renamed from: a */
    private List<AbstractC17030e<T>> m31460a() {
        return C89070n.m154590j(this.f40553c);
    }

    public /* synthetic */ C17029d(View view) {
        this(view, AbstractC17024b.C17025a.f40542a);
    }

    /* renamed from: a */
    public final void mo26905a(AbstractC17030e<T> eVar) {
        C89219l.m154719c(eVar, "");
        this.f40553c.add(eVar);
    }

    /* renamed from: b */
    public final void mo26907b(AbstractC17030e<T> eVar) {
        C89219l.m154719c(eVar, "");
        this.f40553c.remove(eVar);
    }

    /* renamed from: a */
    public final void mo26903a(Uri uri) {
        C89219l.m154719c(uri, "");
        Iterator<T> it = m31460a().iterator();
        while (it.hasNext()) {
            try {
                it.next().mo26861a(this, uri);
            } catch (C16614as unused) {
            }
        }
    }

    /* renamed from: b */
    public final void mo26906b(Uri uri) {
        C89219l.m154719c(uri, "");
        Iterator<T> it = m31460a().iterator();
        while (it.hasNext()) {
            try {
                it.next().mo26863b(this, uri);
            } catch (C16614as unused) {
            }
        }
    }

    private C17029d(T t, ViewGroup.LayoutParams layoutParams) {
        C89219l.m154719c(t, "");
        this.f40551a = t;
        this.f40552b = layoutParams;
        this.f40553c = new LinkedHashSet();
    }

    /* renamed from: a */
    public final void mo26904a(Uri uri, Throwable th) {
        C89219l.m154719c(uri, "");
        C89219l.m154719c(th, "");
        Iterator<T> it = m31460a().iterator();
        while (it.hasNext()) {
            try {
                it.next().mo26862a(this, uri, th);
            } catch (C16614as unused) {
            }
        }
    }
}
