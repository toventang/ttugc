package com.bytedance.android.live.publicscreen.p386a.p389c;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.live.publicscreen.p386a.AbstractC5865d;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.publicscreen.a.c.b */
public abstract class AbstractC5863b extends LinearLayout {

    /* renamed from: a */
    public static final C5864a f14722a = new C5864a((byte) 0);

    /* renamed from: b */
    private final boolean f14723b;

    /* renamed from: c */
    private int f14724c;

    /* renamed from: d */
    private HashMap f14725d;

    static {
        Covode.recordClassIndex(6470);
    }

    /* renamed from: a */
    public View mo11660a(int i) {
        if (this.f14725d == null) {
            this.f14725d = new HashMap();
        }
        View view = (View) this.f14725d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f14725d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public abstract void mo11661a(AbstractC5865d dVar);

    /* renamed from: b */
    public abstract void mo11663b();

    /* renamed from: c */
    public abstract void mo11664c();

    /* renamed from: com.bytedance.android.live.publicscreen.a.c.b$a */
    public static final class C5864a {
        static {
            Covode.recordClassIndex(6471);
        }

        private C5864a() {
        }

        public /* synthetic */ C5864a(byte b) {
            this();
        }
    }

    public int getState() {
        return this.f14724c;
    }

    /* renamed from: a */
    public boolean mo11662a() {
        return this.f14723b;
    }

    public void setState(int i) {
        this.f14724c = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC5863b(Context context, int i) {
        super(context);
        C89219l.m154721d(context, "");
        this.f14724c = i;
    }
}
