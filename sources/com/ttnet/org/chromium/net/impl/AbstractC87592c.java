package com.ttnet.org.chromium.net.impl;

import com.bytedance.covode.number.Covode;
import com.ttnet.org.chromium.net.AbstractC87529ab;
import com.ttnet.org.chromium.net.AbstractC87543g;
import com.ttnet.org.chromium.net.AbstractC87545h;
import com.ttnet.org.chromium.net.AbstractC87655t;
import com.ttnet.org.chromium.net.AbstractC87671w;
import com.ttnet.org.chromium.net.AbstractC87674x;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.ttnet.org.chromium.net.impl.c */
public abstract class AbstractC87592c extends AbstractC87543g {
    static {
        Covode.recordClassIndex(103574);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract AbstractC87640p mo141879a(String str, AbstractC87529ab.AbstractC87531b bVar, Executor executor, int i, Collection<Object> collection, boolean z, boolean z2, boolean z3, boolean z4, int i2, boolean z5, int i3, AbstractC87655t.AbstractC87656a aVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract AbstractC87671w mo141880a(AbstractC87671w.AbstractC87673b bVar, Executor executor, int i, List<String> list, int i2, int i3);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract AbstractC87674x mo141881a(AbstractC87674x.AbstractC87676b bVar, Executor executor, List<String> list, int i, String str, long j, int i2, long j2, String str2, int i3, String str3, Map<String, String> map, Map<String, String> map2, boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract AbstractC87674x mo141882a(AbstractC87674x.AbstractC87676b bVar, Executor executor, List<String> list, Map<String, String> map, Map<String, String> map2, boolean z);

    @Override // com.ttnet.org.chromium.net.AbstractC87536c
    /* renamed from: a */
    public final AbstractC87671w.AbstractC87672a mo141713a(AbstractC87671w.AbstractC87673b bVar) {
        return new C87638n(bVar, this);
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87536c
    /* renamed from: a */
    public final AbstractC87674x.AbstractC87675a mo141714a(AbstractC87674x.AbstractC87676b bVar, Executor executor) {
        return new C87639o(bVar, executor, this);
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87543g, com.ttnet.org.chromium.net.AbstractC87536c
    /* renamed from: a */
    public final /* synthetic */ AbstractC87529ab.AbstractC87530a mo141712a(String str, AbstractC87529ab.AbstractC87531b bVar, Executor executor) {
        return mo141712a(str, bVar, executor);
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87543g
    /* renamed from: b */
    public final AbstractC87545h.AbstractC87546a mo141756b(String str, AbstractC87529ab.AbstractC87531b bVar, Executor executor) {
        return new C87641q(str, bVar, executor, this);
    }
}
