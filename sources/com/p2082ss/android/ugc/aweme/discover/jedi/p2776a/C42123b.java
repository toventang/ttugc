package com.p2082ss.android.ugc.aweme.discover.jedi.p2776a;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.utils.C11227ap;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.widget.AbstractC34766g;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;

/* renamed from: com.ss.android.ugc.aweme.discover.jedi.a.b */
public final class C42123b extends RecyclerView.AbstractC1361h {

    /* renamed from: a */
    private int f98191a = 2;

    /* renamed from: b */
    private int f98192b;

    /* renamed from: c */
    private boolean f98193c;

    /* renamed from: d */
    private boolean f98194d = true;

    static {
        Covode.recordClassIndex(50058);
    }

    public C42123b(int i, boolean z) {
        this.f98192b = i;
        this.f98193c = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        int i;
        int a;
        int a2;
        int i2;
        int d = RecyclerView.m4277d(view);
        RecyclerView.AbstractC1350a adapter = recyclerView.getAdapter();
        if ((adapter instanceof AbstractC34766g) && ((AbstractC34766g) adapter).mo61481b() != null) {
            if (d != 0) {
                d++;
            } else {
                return;
            }
        }
        if (recyclerView.getLayoutManager() instanceof GridLayoutManager) {
            GridLayoutManager.AbstractC1337c cVar = ((GridLayoutManager) recyclerView.getLayoutManager()).f4321g;
            int a3 = cVar.mo4343a(d, this.f98191a);
            int a4 = cVar.mo4342a(d);
            boolean a5 = C80471gb.m139482a();
            if (this.f98193c) {
                int i3 = this.f98191a;
                if (a4 != i3) {
                    if (this.f98194d) {
                        if (!a5) {
                            int i4 = this.f98192b;
                            rect.left = i4 - ((a3 * i4) / i3);
                            a = ((a3 + 1) * this.f98192b) / this.f98191a;
                        } else {
                            int i5 = this.f98192b;
                            rect.right = i5 - ((a3 * i5) / i3);
                            rect.left = ((a3 + 1) * this.f98192b) / this.f98191a;
                            rect.top = this.f98192b;
                            return;
                        }
                    } else if (a3 == 0) {
                        if (!a5) {
                            a2 = this.f98192b * 2;
                        } else {
                            a2 = ((int) C11227ap.m19885a(view.getContext(), 7.0f)) / 2;
                        }
                        rect.left = a2;
                        if (!a5) {
                            i2 = ((int) C11227ap.m19885a(view.getContext(), 7.0f)) / 2;
                        } else {
                            i2 = this.f98192b * 2;
                        }
                        rect.right = i2;
                        rect.top = this.f98192b;
                        return;
                    } else {
                        if (!a5) {
                            i = ((int) C11227ap.m19885a(view.getContext(), 7.0f)) / 2;
                        } else {
                            i = this.f98192b * 2;
                        }
                        rect.left = i;
                        if (!a5) {
                            a = this.f98192b * 2;
                        } else {
                            a = ((int) C11227ap.m19885a(view.getContext(), 7.0f)) / 2;
                        }
                    }
                    rect.right = a;
                    rect.top = this.f98192b;
                    return;
                }
                return;
            }
            rect.left = (this.f98192b * a3) / this.f98191a;
            int i6 = this.f98192b;
            rect.right = i6 - (((a3 + 1) * i6) / this.f98191a);
            if (d >= this.f98191a) {
                rect.top = this.f98192b;
            }
        }
    }
}
