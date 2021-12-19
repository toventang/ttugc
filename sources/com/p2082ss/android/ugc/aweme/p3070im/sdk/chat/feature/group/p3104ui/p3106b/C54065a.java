package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.p3104ui.p3106b;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.content.C0643b;
import androidx.core.p037h.C0778h;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.p1198d.C17191a;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1710c.C23008e;
import com.bytedance.tux.p1710c.C23009f;
import com.facebook.drawee.p1855f.C24246a;
import com.facebook.drawee.p1855f.C24250e;
import com.facebook.drawee.view.C24262c;
import com.p1793c.p1794a.C23758a;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageView;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.p3104ui.p3106b.C54067c;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.b.a */
public final class C54065a extends AbstractC39060f<C54066b> {
    static {
        Covode.recordClassIndex(63740);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
        C89219l.m154721d(viewGroup, "");
        return new C54067c(viewGroup);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final void mo60186a(RecyclerView.ViewHolder viewHolder, int i) {
        C54066b bVar;
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (!(viewHolder instanceof C54067c)) {
            viewHolder = null;
        }
        C54067c cVar = (C54067c) viewHolder;
        if (cVar != null && (bVar = (C54066b) this.f92236l.get(i)) != null) {
            C89219l.m154721d(bVar, "");
            if (i == 0) {
                View view = cVar.itemView;
                C89219l.m154716b(view, "");
                FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.b58);
                C89219l.m154716b(frameLayout, "");
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = layoutParams;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                if (marginLayoutParams2 != null) {
                    C0778h.m2703a(marginLayoutParams2, 0);
                }
            }
            if (bVar.f123918b > 0) {
                View view2 = cVar.itemView;
                C89219l.m154716b(view2, "");
                C23008e a = C23009f.m43397a(C54067c.C54068a.f123919a);
                Context context = ((AvatarImageView) view2.findViewById(R.id.a5k)).getContext();
                C89219l.m154716b(context, "");
                a.mo37389a(context);
                C17191a.C17192a aVar = new C17191a.C17192a();
                aVar.mo27180c("+");
                aVar.mo27177a(String.valueOf(bVar.f123918b));
                View view3 = cVar.itemView;
                C89219l.m154716b(view3, "");
                TuxTextView tuxTextView = (TuxTextView) view3.findViewById(R.id.f_n);
                C89219l.m154716b(tuxTextView, "");
                tuxTextView.setText(aVar.f40973a);
                View view4 = cVar.itemView;
                C89219l.m154716b(view4, "");
                TuxTextView tuxTextView2 = (TuxTextView) view4.findViewById(R.id.f_n);
                C89219l.m154716b(tuxTextView2, "");
                tuxTextView2.setVisibility(0);
                return;
            }
            IMUser iMUser = bVar.f123917a;
            if (iMUser != null) {
                View view5 = cVar.itemView;
                C89219l.m154716b(view5, "");
                C34577e.m70592a((RemoteImageView) view5.findViewById(R.id.a5k), iMUser.getDisplayAvatar());
            } else {
                View view6 = cVar.itemView;
                C89219l.m154716b(view6, "");
                C34577e.m70591a((RemoteImageView) view6.findViewById(R.id.a5k), 2131232314);
            }
            C24250e b = C24250e.m46055b(C23758a.m44906a(20));
            View view7 = cVar.itemView;
            C89219l.m154716b(view7, "");
            b.mo39981a(C0643b.m2378c(view7.getContext(), R.color.l), C23758a.m44906a(1));
            View view8 = cVar.itemView;
            C89219l.m154716b(view8, "");
            C24262c cVar2 = (C24262c) view8.findViewById(R.id.a5k);
            C89219l.m154716b(cVar2, "");
            C24246a aVar2 = (C24246a) cVar2.getHierarchy();
            C89219l.m154716b(aVar2, "");
            aVar2.mo39959a(b);
            View view9 = cVar.itemView;
            C89219l.m154716b(view9, "");
            TuxTextView tuxTextView3 = (TuxTextView) view9.findViewById(R.id.f_n);
            C89219l.m154716b(tuxTextView3, "");
            tuxTextView3.setVisibility(8);
        }
    }
}
