package com.p2082ss.android.ugc.aweme.shortvideo.p3896z.p3899c;

import android.app.Activity;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.shortvideo.p3896z.p3897a.C74332a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3896z.p3900d.C74363a;
import com.p2082ss.android.ugc.aweme.utils.C80564i;
import com.p2082ss.android.ugc.tools.p4340c.C84402a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.z.c.a */
public final class C74335a extends AbstractC39063h {

    /* renamed from: a */
    public int f167168a;

    /* renamed from: b */
    public final List<C74332a> f167169b = new ArrayList();

    /* renamed from: c */
    public final C74363a f167170c;

    /* renamed from: d */
    private final AbstractC89183m<Integer, View, C89391z> f167171d = new C74337a(this);

    static {
        Covode.recordClassIndex(87107);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: c */
    public final int mo60933c() {
        return this.f167169b.size();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: c */
    public final int mo60936c(int i) {
        return this.f167169b.get(i).f167166b;
    }

    /* renamed from: a */
    public final void mo116961a(List<C74332a> list) {
        C89219l.m154721d(list, "");
        this.f167169b.clear();
        this.f167169b.addAll(list);
        notifyDataSetChanged();
    }

    public C74335a(C74363a aVar) {
        C89219l.m154721d(aVar, "");
        this.f167170c = aVar;
        registerAdapterDataObserver(new RecyclerView.AbstractC1353c(this) {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.p3896z.p3899c.C74335a.C743361 */

            /* renamed from: a */
            final /* synthetic */ C74335a f167172a;

            static {
                Covode.recordClassIndex(87108);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
            /* renamed from: a */
            public final void mo4655a() {
                C74335a aVar = this.f167172a;
                aVar.f167168a = aVar.getItemCount();
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f167172a = r1;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
            /* renamed from: b */
            public final void mo4660b(int i, int i2) {
                C74335a aVar = this.f167172a;
                aVar.f167168a = aVar.getItemCount();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
            /* renamed from: c */
            public final void mo4661c(int i, int i2) {
                C74335a aVar = this.f167172a;
                aVar.f167168a = aVar.getItemCount();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
            /* renamed from: a */
            public final void mo4656a(int i, int i2) {
                C74335a aVar = this.f167172a;
                aVar.f167168a = aVar.getItemCount();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
            /* renamed from: a */
            public final void mo4657a(int i, int i2, int i3) {
                C74335a aVar = this.f167172a;
                aVar.f167168a = aVar.getItemCount();
            }
        });
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.f6, viewGroup, false);
        C74363a aVar = this.f167170c;
        C89219l.m154716b(a, "");
        C74359d dVar = new C74359d(aVar, a);
        dVar.f167208a = this.f167171d;
        return dVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.z.c.a$a */
    static final class C74337a extends AbstractC89220m implements AbstractC89183m<Integer, View, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C74335a f167173a;

        static {
            Covode.recordClassIndex(87109);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74337a(C74335a aVar) {
            super(2);
            this.f167173a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Integer num, View view) {
            List<C74332a> a;
            int intValue = num.intValue();
            View view2 = view;
            C89219l.m154721d(view2, "");
            Activity a2 = C80564i.m139647a(view2.getContext());
            if ((a2 instanceof ActivityC0945e) && a2 != null) {
                C74363a aVar = this.f167173a.f167170c;
                C74332a aVar2 = this.f167173a.f167169b.get(intValue);
                C89219l.m154721d(aVar2, "");
                List<C74332a> value = aVar.f167221b.getValue();
                if (value != null) {
                    a = C89070n.m154585g((Collection) value);
                    if (a.contains(aVar2)) {
                        a.remove(aVar2);
                    } else {
                        a.clear();
                        a.add(aVar2);
                    }
                } else {
                    a = C89070n.m154516a(aVar2);
                }
                aVar.mo116980a(a);
                this.f167173a.notifyDataSetChanged();
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final void mo60186a(RecyclerView.ViewHolder viewHolder, int i) {
        String str;
        if (getItemViewType(i) == 3) {
            if (!(viewHolder instanceof C74359d)) {
                viewHolder = null;
            }
            C74359d dVar = (C74359d) viewHolder;
            if (dVar != null) {
                C74332a aVar = this.f167169b.get(i);
                C89219l.m154721d(aVar, "");
                User user = aVar.f167165a;
                TextView textView = dVar.f167209b;
                String remarkName = user.getRemarkName();
                if (remarkName == null || remarkName.length() == 0) {
                    str = user.getNickname();
                } else {
                    str = user.getRemarkName();
                }
                textView.setText(str);
                dVar.f167210c.setText(user.getUniqueId());
                C84402a.m145169a(dVar.f167211d, user.getAvatarThumb(), -1, -1);
                ViewGroup.LayoutParams layoutParams = dVar.f167212e.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int i2 = Build.VERSION.SDK_INT;
                marginLayoutParams.setMarginStart(dVar.mo116974a());
                marginLayoutParams.leftMargin = dVar.mo116974a();
                dVar.f167212e.setLayoutParams(marginLayoutParams);
                List<C74332a> value = dVar.f167213f.f167221b.getValue();
                if (value == null) {
                    value = C89086z.INSTANCE;
                }
                dVar.f167212e.setChecked(value.contains(aVar));
            }
        }
    }
}
