package com.facebook;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.q */
public final class C24912q extends AbstractList<GraphRequest> {

    /* renamed from: g */
    private static AtomicInteger f59144g = new AtomicInteger();

    /* renamed from: a */
    public Handler f59145a;

    /* renamed from: b */
    public List<GraphRequest> f59146b;

    /* renamed from: c */
    public int f59147c;

    /* renamed from: d */
    public final String f59148d;

    /* renamed from: e */
    public List<AbstractC24913a> f59149e;

    /* renamed from: f */
    public String f59150f;

    /* renamed from: com.facebook.q$a */
    public interface AbstractC24913a {
        static {
            Covode.recordClassIndex(29106);
        }

        /* renamed from: a */
        void mo39537a();
    }

    /* renamed from: com.facebook.q$b */
    public interface AbstractC24914b extends AbstractC24913a {
        static {
            Covode.recordClassIndex(29107);
        }
    }

    /* renamed from: a */
    public final AsyncTaskC24911p mo40792a() {
        return GraphRequest.m45085b(this);
    }

    public final void clear() {
        this.f59146b.clear();
    }

    public final int size() {
        return this.f59146b.size();
    }

    static {
        Covode.recordClassIndex(29105);
    }

    public C24912q() {
        this.f59146b = new ArrayList();
        this.f59147c = 0;
        this.f59148d = Integer.valueOf(f59144g.incrementAndGet()).toString();
        this.f59149e = new ArrayList();
        this.f59146b = new ArrayList();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.List, java.util.AbstractList
    public final /* bridge */ /* synthetic */ GraphRequest remove(int i) {
        return this.f59146b.remove(i);
    }

    /* renamed from: a */
    public final GraphRequest get(int i) {
        return this.f59146b.get(i);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList
    public final /* bridge */ /* synthetic */ boolean add(GraphRequest graphRequest) {
        return this.f59146b.add(graphRequest);
    }

    /* renamed from: a */
    public final void mo40793a(AbstractC24913a aVar) {
        if (!this.f59149e.contains(aVar)) {
            this.f59149e.add(aVar);
        }
    }

    public C24912q(Collection<GraphRequest> collection) {
        this.f59146b = new ArrayList();
        this.f59147c = 0;
        this.f59148d = Integer.valueOf(f59144g.incrementAndGet()).toString();
        this.f59149e = new ArrayList();
        this.f59146b = new ArrayList(collection);
    }

    public C24912q(GraphRequest... graphRequestArr) {
        this.f59146b = new ArrayList();
        this.f59147c = 0;
        this.f59148d = Integer.valueOf(f59144g.incrementAndGet()).toString();
        this.f59149e = new ArrayList();
        this.f59146b = Arrays.asList(graphRequestArr);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
    @Override // java.util.List, java.util.AbstractList
    public final /* bridge */ /* synthetic */ void add(int i, GraphRequest graphRequest) {
        this.f59146b.add(i, graphRequest);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
    @Override // java.util.List, java.util.AbstractList
    public final /* bridge */ /* synthetic */ GraphRequest set(int i, GraphRequest graphRequest) {
        return this.f59146b.set(i, graphRequest);
    }
}
