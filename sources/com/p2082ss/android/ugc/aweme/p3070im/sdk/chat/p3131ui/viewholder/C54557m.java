package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder;

import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.GroupAnnouncementContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3136d.C54438a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.m */
public class C54557m extends AbstractC54482a<GroupAnnouncementContent> {

    /* renamed from: a */
    private TextView f125047a;

    /* renamed from: b */
    private TextView f125048b;

    static {
        Covode.recordClassIndex(64268);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a
    /* renamed from: a */
    public void mo91007a() {
        super.mo91007a();
        Object a = mo91563a(R.id.f63);
        C89219l.m154716b(a, "");
        this.f125047a = (TextView) a;
        Object a2 = mo91563a(R.id.eu6);
        C89219l.m154716b(a2, "");
        this.f125048b = (TextView) a2;
        Object a3 = mo91563a(R.id.acq);
        C89219l.m154716b(a3, "");
        this.f124819o = C54438a.C54439a.m99780a((View) a3);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a
    /* renamed from: a */
    public final void mo91567a(C19538ai aiVar) {
        if (aiVar != null) {
            this.f124819o.f124697c.setEnabled(true);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54557m(View view, EnumC53772b bVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(bVar, "");
    }

    /* renamed from: a */
    public void mo91008a(C19538ai aiVar, C19538ai aiVar2, GroupAnnouncementContent groupAnnouncementContent, int i) {
        C89219l.m154721d(aiVar, "");
        super.mo91008a(aiVar, aiVar2, (BaseContent) groupAnnouncementContent, i);
        if (groupAnnouncementContent != null) {
            TextView textView = this.f125047a;
            if (textView == null) {
                C89219l.m154710a("tvTitle");
            }
            textView.setText(groupAnnouncementContent.getTitle());
            TextView textView2 = this.f125048b;
            if (textView2 == null) {
                C89219l.m154710a("tvContent");
            }
            textView2.setText(groupAnnouncementContent.getAnnouncement());
        }
    }
}
