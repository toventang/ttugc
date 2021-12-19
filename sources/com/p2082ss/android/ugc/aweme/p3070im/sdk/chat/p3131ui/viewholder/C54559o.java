package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder;

import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.p1198d.C17191a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.p2082ss.android.ugc.aweme.base.p2379ui.CircleImageView;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.GroupInviteCardContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3136d.C54438a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.p3185c.C55198a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.invite.p3203a.C55371a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.o */
public class C54559o extends AbstractC54482a<GroupInviteCardContent> {

    /* renamed from: a */
    private CircleImageView f125050a;

    /* renamed from: b */
    private TextView f125051b;

    /* renamed from: x */
    private TextView f125052x;

    static {
        Covode.recordClassIndex(64270);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a
    /* renamed from: a */
    public void mo91007a() {
        super.mo91007a();
        Object a = mo91563a(R.id.icon_iv);
        C89219l.m154716b(a, "");
        this.f125050a = (CircleImageView) a;
        Object a2 = mo91563a(R.id.title_tv);
        C89219l.m154716b(a2, "");
        this.f125051b = (TextView) a2;
        Object a3 = mo91563a(R.id.ajs);
        C89219l.m154716b(a3, "");
        this.f125052x = (TextView) a3;
        Object a4 = mo91563a(R.id.acq);
        C89219l.m154716b(a4, "");
        this.f124819o = C54438a.C54439a.m99780a((View) a4);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54559o(View view, EnumC53772b bVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(bVar, "");
    }

    /* renamed from: a */
    public void mo91008a(C19538ai aiVar, C19538ai aiVar2, GroupInviteCardContent groupInviteCardContent, int i) {
        String str;
        String name;
        String str2 = "";
        C89219l.m154721d(aiVar, str2);
        super.mo91008a(aiVar, aiVar2, (BaseContent) groupInviteCardContent, i);
        if (groupInviteCardContent != null) {
            CircleImageView circleImageView = this.f125050a;
            if (circleImageView == null) {
                C89219l.m154710a("icon");
            }
            C55371a group = groupInviteCardContent.getGroup();
            if (group != null) {
                str = group.getAvatarUrl();
            } else {
                str = null;
            }
            C55198a.m100935a(circleImageView, str);
            TextView textView = this.f125051b;
            if (textView == null) {
                C89219l.m154710a("tvTitle");
            }
            textView.setText(C17867d.m33078a().getString(R.string.c7f));
            TextView textView2 = this.f125052x;
            if (textView2 == null) {
                C89219l.m154710a("tvContent");
            }
            C17191a.C17192a aVar = new C17191a.C17192a();
            C55371a group2 = groupInviteCardContent.getGroup();
            if (!(group2 == null || (name = group2.getName()) == null)) {
                str2 = name;
            }
            textView2.setText(aVar.mo27177a(str2).f40973a);
        }
        this.f124819o.mo91505a(50331648, 46);
        this.f124819o.mo91505a(67108864, this.f124823s);
    }
}
