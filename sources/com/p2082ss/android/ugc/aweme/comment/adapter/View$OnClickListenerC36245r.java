package com.p2082ss.android.ugc.aweme.comment.adapter;

import android.content.Context;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.facebook.drawee.p1855f.C24246a;
import com.facebook.drawee.p1855f.C24250e;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartAvatarImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.comment.barrage.view.CommentMultiAnchorTagLayout;
import com.p2082ss.android.ugc.aweme.comment.barrage.view.CommentRichTagView;
import com.p2082ss.android.ugc.aweme.comment.barrage.view.CommentTaggedPeopleView;
import com.p2082ss.android.ugc.aweme.comment.p2493g.AbstractC36428a;
import com.p2082ss.android.ugc.aweme.comment.widget.CommentDescView;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.r */
public final class View$OnClickListenerC36245r extends RecyclerView.ViewHolder implements View.OnClickListener {

    /* renamed from: l */
    public static final C36246a f85617l = new C36246a((byte) 0);

    /* renamed from: a */
    final SmartAvatarImageView f85618a;

    /* renamed from: b */
    final TuxTextView f85619b;

    /* renamed from: c */
    final CommentDescView f85620c;

    /* renamed from: d */
    TuxTextView f85621d;

    /* renamed from: e */
    final CommentTaggedPeopleView f85622e;

    /* renamed from: f */
    final CommentMultiAnchorTagLayout f85623f;

    /* renamed from: g */
    CommentRichTagView f85624g;

    /* renamed from: h */
    final int f85625h;

    /* renamed from: i */
    User f85626i;

    /* renamed from: j */
    public DataCenter f85627j;

    /* renamed from: k */
    public final AbstractC36428a f85628k;

    /* renamed from: m */
    private final Context f85629m;

    /* renamed from: n */
    private final ActivityC0945e f85630n;

    static {
        Covode.recordClassIndex(43511);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.adapter.r$a */
    public static final class C36246a {
        static {
            Covode.recordClassIndex(43512);
        }

        private C36246a() {
        }

        public /* synthetic */ C36246a(byte b) {
            this();
        }
    }

    public final void onClick(View view) {
        Integer valueOf;
        String str;
        AbstractC36428a aVar;
        String str2;
        String str3;
        ClickAgent.onClick(view);
        String str4 = null;
        if (view != null && (valueOf = Integer.valueOf(view.getId())) != null) {
            if ((valueOf.intValue() == R.id.nz || valueOf.intValue() == R.id.title) && !C58001a.m104815a(view, 1200)) {
                User user = this.f85626i;
                if (user != null) {
                    str = user.getUid();
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str) && (aVar = this.f85628k) != null) {
                    User user2 = this.f85626i;
                    if (user2 != null) {
                        str2 = user2.getUid();
                    } else {
                        str2 = null;
                    }
                    User user3 = this.f85626i;
                    if (user3 != null) {
                        str4 = user3.getSecUid();
                    }
                    if (view.getId() == R.id.nz) {
                        str3 = "click_head";
                    } else {
                        str3 = "click_name";
                    }
                    aVar.mo63747a(str2, str4, str3);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public View$OnClickListenerC36245r(View view, AbstractC36428a aVar) {
        super(view);
        C89219l.m154721d(view, "");
        this.f85628k = aVar;
        Context context = view.getContext();
        this.f85629m = context;
        Context context2 = view.getContext();
        Objects.requireNonNull(context2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.f85630n = (ActivityC0945e) context2;
        View findViewById = view.findViewById(R.id.nz);
        C89219l.m154716b(findViewById, "");
        SmartAvatarImageView smartAvatarImageView = (SmartAvatarImageView) findViewById;
        this.f85618a = smartAvatarImageView;
        View findViewById2 = view.findViewById(R.id.title);
        C89219l.m154716b(findViewById2, "");
        TuxTextView tuxTextView = (TuxTextView) findViewById2;
        this.f85619b = tuxTextView;
        View findViewById3 = view.findViewById(R.id.a9b);
        C89219l.m154716b(findViewById3, "");
        this.f85620c = (CommentDescView) findViewById3;
        View findViewById4 = view.findViewById(R.id.a_e);
        C89219l.m154716b(findViewById4, "");
        this.f85621d = (TuxTextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.ef6);
        C89219l.m154716b(findViewById5, "");
        this.f85622e = (CommentTaggedPeopleView) findViewById5;
        View findViewById6 = view.findViewById(R.id.cmp);
        C89219l.m154716b(findViewById6, "");
        this.f85623f = (CommentMultiAnchorTagLayout) findViewById6;
        this.f85624g = (CommentRichTagView) view.findViewById(R.id.dt);
        this.f85625h = (int) C13628n.m24520b(context, 32.0f);
        C24246a aVar2 = (C24246a) smartAvatarImageView.getHierarchy();
        C89219l.m154716b(aVar2, "");
        C24250e eVar = aVar2.f57470a;
        if (eVar != null) {
            eVar.mo39985c((float) C34728n.m70946a(0.5d));
            eVar.f57504f = smartAvatarImageView.getResources().getColor(R.color.b4);
        }
        smartAvatarImageView.setOnClickListener(this);
        tuxTextView.setOnClickListener(this);
        TextPaint paint = tuxTextView.getPaint();
        C89219l.m154716b(paint, "");
        paint.setFakeBoldText(true);
    }
}
