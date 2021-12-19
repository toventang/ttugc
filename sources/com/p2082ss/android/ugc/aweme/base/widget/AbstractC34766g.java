package com.p2082ss.android.ugc.aweme.base.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;

/* renamed from: com.ss.android.ugc.aweme.base.widget.g */
public abstract class AbstractC34766g<DATA> extends AbstractC39060f<DATA> {

    /* renamed from: a */
    public static int f82107a = 10000;

    /* renamed from: b */
    public static int f82108b = 20000;

    /* renamed from: c */
    public View f82109c;

    /* renamed from: d */
    private View f82110d;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public RecyclerView.ViewHolder mo61482b(ViewGroup viewGroup, int i) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo61483b(RecyclerView.ViewHolder viewHolder, int i) {
    }

    /* renamed from: b */
    public View mo61481b() {
        return this.f82110d;
    }

    /* renamed from: d */
    public boolean mo61484d() {
        if (this.f82110d != null) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(41762);
    }

    public AbstractC34766g() {
        this.f92247s = new GridLayoutManager.AbstractC1337c() {
            /* class com.p2082ss.android.ugc.aweme.base.widget.AbstractC34766g.C347671 */

            static {
                Covode.recordClassIndex(41763);
            }

            @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1337c
            /* renamed from: a */
            public final int mo4342a(int i) {
                if (i == 0 && AbstractC34766g.this.mo60936c(i) == AbstractC34766g.f82107a) {
                    return 2;
                }
                return 1;
            }
        };
        mo67825k();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f
    /* renamed from: c */
    public int mo60933c() {
        int i;
        if (this.f82110d == null) {
            i = 0;
        } else {
            i = 1;
        }
        return super.mo60933c() + i;
    }

    /* renamed from: com.ss.android.ugc.aweme.base.widget.g$a */
    static class C34768a extends RecyclerView.ViewHolder {
        static {
            Covode.recordClassIndex(41764);
        }

        C34768a(View view) {
            super(view);
        }
    }

    /* renamed from: a */
    public void mo61480a(View view) {
        if (view != null) {
            this.f82110d = view;
            notifyItemInserted(0);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: c */
    public int mo60936c(int i) {
        if (this.f82110d == null && this.f82109c == null) {
            return 0;
        }
        if (i == 0) {
            return f82107a;
        }
        if (!this.f92274v || i != getItemCount() - 1) {
            return 0;
        }
        return f82108b;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
        if (this.f82110d != null && i == f82107a) {
            return new C34768a(this.f82110d);
        }
        if (this.f82109c == null || i != f82108b) {
            return mo61482b(viewGroup, i);
        }
        return mo62748a_(viewGroup);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public void mo60186a(RecyclerView.ViewHolder viewHolder, int i) {
        if (getItemViewType(i) == 0) {
            if (!(this.f82110d == null || i == 0)) {
                i--;
            }
            mo61483b(viewHolder, i);
        } else if (getItemViewType(i) == f82108b && (viewHolder instanceof AbstractC39063h.C39069c)) {
            ((AbstractC39063h.C39069c) viewHolder).mo67826a();
        }
    }
}
