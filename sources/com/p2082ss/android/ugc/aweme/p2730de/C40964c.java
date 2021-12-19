package com.p2082ss.android.ugc.aweme.p2730de;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.de.c */
public final class C40964c {

    /* renamed from: a */
    public static LinkedList<Activity> f95797a = new LinkedList<>();

    /* renamed from: b */
    public List<AbstractC40966a> f95798b;

    /* renamed from: c */
    public boolean f95799c;

    /* renamed from: d */
    public int f95800d;

    /* renamed from: e */
    public int f95801e;

    /* renamed from: f */
    private boolean f95802f;

    /* renamed from: com.ss.android.ugc.aweme.de.c$a */
    public interface AbstractC40966a {
        static {
            Covode.recordClassIndex(48818);
        }

        /* renamed from: a */
        void mo70154a();

        /* renamed from: b */
        void mo70155b();
    }

    /* renamed from: com.ss.android.ugc.aweme.de.c$b */
    public static class C40967b implements AbstractC40966a {
        static {
            Covode.recordClassIndex(48819);
        }

        @Override // com.p2082ss.android.ugc.aweme.p2730de.C40964c.AbstractC40966a
        /* renamed from: a */
        public void mo70154a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.p2730de.C40964c.AbstractC40966a
        /* renamed from: b */
        public void mo70155b() {
        }
    }

    private C40964c() {
    }

    /* renamed from: a */
    public final boolean mo70144a() {
        if (this.f95800d <= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.de.c$c */
    public static final class C40968c {

        /* renamed from: a */
        public static final C40964c f95804a = new C40964c((byte) 0);

        static {
            Covode.recordClassIndex(48820);
        }
    }

    static {
        Covode.recordClassIndex(48816);
    }

    /* renamed from: c */
    public static Activity m82474c() {
        if (f95797a.isEmpty()) {
            return null;
        }
        return f95797a.getLast();
    }

    /* renamed from: b */
    public final void mo70145b() {
        if (this.f95800d > 0) {
            if (!this.f95802f) {
                for (AbstractC40966a aVar : this.f95798b) {
                    aVar.mo70155b();
                }
                this.f95802f = true;
            }
        } else if (this.f95802f) {
            for (AbstractC40966a aVar2 : this.f95798b) {
                aVar2.mo70154a();
            }
            this.f95802f = false;
        }
    }

    /* synthetic */ C40964c(byte b) {
        this();
    }

    /* renamed from: a */
    public final void mo70143a(AbstractC40966a aVar) {
        if (!this.f95798b.contains(aVar)) {
            this.f95798b.add(aVar);
        }
    }

    /* renamed from: b */
    public final void mo70146b(AbstractC40966a aVar) {
        if (this.f95798b.contains(aVar)) {
            this.f95798b.remove(aVar);
        }
    }
}
