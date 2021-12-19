package com.bytedance.android.livesdk.widget.p659a;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.widget.a.b */
public abstract class AbstractC11372b {

    /* renamed from: a */
    protected final RecyclerView.AbstractC1362i f27330a;

    /* renamed from: b */
    final Rect f27331b;

    /* renamed from: c */
    private int f27332c;

    static {
        Covode.recordClassIndex(13028);
    }

    /* renamed from: a */
    public abstract int mo18247a();

    /* renamed from: a */
    public abstract int mo18248a(View view);

    /* renamed from: b */
    public abstract int mo18249b();

    /* renamed from: b */
    public abstract int mo18250b(View view);

    /* renamed from: c */
    public abstract int mo18251c();

    /* renamed from: c */
    public abstract int mo18252c(View view);

    /* renamed from: a */
    public static AbstractC11372b m20201a(RecyclerView.AbstractC1362i iVar) {
        return new AbstractC11372b(iVar) {
            /* class com.bytedance.android.livesdk.widget.p659a.AbstractC11372b.C113731 */

            static {
                Covode.recordClassIndex(13029);
            }

            @Override // com.bytedance.android.livesdk.widget.p659a.AbstractC11372b
            /* renamed from: a */
            public final int mo18247a() {
                return this.f27330a.mo4731t();
            }

            @Override // com.bytedance.android.livesdk.widget.p659a.AbstractC11372b
            /* renamed from: b */
            public final int mo18249b() {
                return this.f27330a.f4485J;
            }

            @Override // com.bytedance.android.livesdk.widget.p659a.AbstractC11372b
            /* renamed from: c */
            public final int mo18251c() {
                return (this.f27330a.f4485J - this.f27330a.mo4731t()) - this.f27330a.mo4733v();
            }

            @Override // com.bytedance.android.livesdk.widget.p659a.AbstractC11372b
            /* renamed from: a */
            public final int mo18248a(View view) {
                return RecyclerView.AbstractC1362i.m4431o(view) - ((RecyclerView.C1367j) view.getLayoutParams()).leftMargin;
            }

            @Override // com.bytedance.android.livesdk.widget.p659a.AbstractC11372b
            /* renamed from: b */
            public final int mo18250b(View view) {
                return RecyclerView.AbstractC1362i.m4433q(view) + ((RecyclerView.C1367j) view.getLayoutParams()).rightMargin;
            }

            @Override // com.bytedance.android.livesdk.widget.p659a.AbstractC11372b
            /* renamed from: c */
            public final int mo18252c(View view) {
                RecyclerView.C1367j jVar = (RecyclerView.C1367j) view.getLayoutParams();
                return RecyclerView.AbstractC1362i.m4429m(view) + jVar.leftMargin + jVar.rightMargin;
            }
        };
    }

    /* renamed from: b */
    public static AbstractC11372b m20202b(RecyclerView.AbstractC1362i iVar) {
        return new AbstractC11372b(iVar) {
            /* class com.bytedance.android.livesdk.widget.p659a.AbstractC11372b.C113742 */

            static {
                Covode.recordClassIndex(13030);
            }

            @Override // com.bytedance.android.livesdk.widget.p659a.AbstractC11372b
            /* renamed from: a */
            public final int mo18247a() {
                return this.f27330a.mo4732u();
            }

            @Override // com.bytedance.android.livesdk.widget.p659a.AbstractC11372b
            /* renamed from: b */
            public final int mo18249b() {
                return this.f27330a.f4486K;
            }

            @Override // com.bytedance.android.livesdk.widget.p659a.AbstractC11372b
            /* renamed from: c */
            public final int mo18251c() {
                return (this.f27330a.f4486K - this.f27330a.mo4732u()) - this.f27330a.mo4734w();
            }

            @Override // com.bytedance.android.livesdk.widget.p659a.AbstractC11372b
            /* renamed from: a */
            public final int mo18248a(View view) {
                return RecyclerView.AbstractC1362i.m4432p(view) - ((RecyclerView.C1367j) view.getLayoutParams()).topMargin;
            }

            @Override // com.bytedance.android.livesdk.widget.p659a.AbstractC11372b
            /* renamed from: b */
            public final int mo18250b(View view) {
                return RecyclerView.AbstractC1362i.m4434r(view) + ((RecyclerView.C1367j) view.getLayoutParams()).bottomMargin;
            }

            @Override // com.bytedance.android.livesdk.widget.p659a.AbstractC11372b
            /* renamed from: c */
            public final int mo18252c(View view) {
                RecyclerView.C1367j jVar = (RecyclerView.C1367j) view.getLayoutParams();
                return RecyclerView.AbstractC1362i.m4430n(view) + jVar.topMargin + jVar.bottomMargin;
            }
        };
    }

    private AbstractC11372b(RecyclerView.AbstractC1362i iVar) {
        this.f27332c = Integer.MIN_VALUE;
        this.f27331b = new Rect();
        this.f27330a = iVar;
    }

    /* synthetic */ AbstractC11372b(RecyclerView.AbstractC1362i iVar, byte b) {
        this(iVar);
    }
}
