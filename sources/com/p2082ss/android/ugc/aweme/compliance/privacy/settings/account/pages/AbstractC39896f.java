package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages;

import android.content.Context;
import android.text.Spannable;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1719f.C23136b;
import com.bytedance.tux.table.cell.TuxTextCell;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39720f;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39724i;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.C39723h;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.f */
public abstract class AbstractC39896f extends AbstractC39720f {

    /* renamed from: a */
    public final C39901g f93855a;

    static {
        Covode.recordClassIndex(47637);
    }

    /* renamed from: a */
    public abstract void mo69153a(TuxTextCell tuxTextCell);

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39720f
    /* renamed from: b */
    public final int mo69101b() {
        return R.layout.un;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39720f, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39724i
    /* renamed from: c */
    public final boolean mo69102c() {
        AbstractC39724i iVar = this.f93855a.f93873k;
        if (iVar != null) {
            return iVar.mo69102c();
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39720f, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39724i
    /* renamed from: d */
    public final boolean mo69103d() {
        AbstractC39724i iVar = this.f93855a.f93873k;
        if (iVar != null) {
            return iVar.mo69103d();
        }
        return true;
    }

    public AbstractC39896f(C39901g gVar) {
        C89219l.m154721d(gVar, "");
        this.f93855a = gVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39714c
    /* renamed from: a */
    public final void mo69095a(C39723h hVar, int i) {
        CharSequence charSequence;
        int i2;
        C89219l.m154721d(hVar, "");
        View view = hVar.itemView;
        C89219l.m154716b(view, "");
        Context context = view.getContext();
        TuxTextCell tuxTextCell = (TuxTextCell) view.findViewById(R.id.bqp);
        String str = this.f93855a.f93864b;
        String str2 = null;
        if (str == null) {
            Integer num = this.f93855a.f93863a;
            if (num != null) {
                str = context.getString(num.intValue());
            } else {
                str = null;
            }
        }
        tuxTextCell.setTitle(str);
        AbstractC89171a<? extends CharSequence> aVar = this.f93855a.f93867e;
        if ((aVar == null || (charSequence = (CharSequence) aVar.invoke()) == null) && (charSequence = this.f93855a.f93866d) == null) {
            Integer num2 = this.f93855a.f93865c;
            if (num2 != null) {
                str2 = context.getString(num2.intValue());
            }
            charSequence = str2;
        }
        tuxTextCell.setSubtitle(charSequence);
        if (charSequence instanceof Spannable) {
            View findViewById = tuxTextCell.findViewById(R.id.ebd);
            C89219l.m154716b(findViewById, "");
            ((TuxTextView) findViewById).setMovementMethod(C23136b.f54757a);
        }
        C89219l.m154716b(tuxTextCell, "");
        mo69153a(tuxTextCell);
        tuxTextCell.setCellEnabled(mo69102c());
        if (mo69103d()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        tuxTextCell.setVisibility(i2);
    }
}
