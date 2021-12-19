package com.p2082ss.android.ugc.aweme.shortvideo;

import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73966as;
import com.p2082ss.android.ugc.aweme.video.hashtag.helper.BaseTitleHelper;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.ek */
public final /* synthetic */ class View$OnClickListenerC71807ek implements View.OnClickListener {

    /* renamed from: a */
    private final C71804ej f160937a;

    static {
        Covode.recordClassIndex(84352);
    }

    View$OnClickListenerC71807ek(C71804ej ejVar) {
        this.f160937a = ejVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C71804ej ejVar = this.f160937a;
        if (ejVar.f160912c.getSelectionEnd() <= ejVar.f160912c.getSelectionStart()) {
            KeyboardUtils.m70896b(ejVar.f160912c);
            Editable text = ejVar.f160912c.getText();
            int length = text.length();
            if (!TextUtils.isEmpty(ejVar.f160912c.getAdTag())) {
                length = ejVar.f160912c.getNoAdTagText().length();
            }
            if (length <= C73966as.m130092a()) {
                int selectionStart = Selection.getSelectionStart(text);
                if (ejVar.f160921l != null && !text.toString().endsWith("#")) {
                    BaseTitleHelper baseTitleHelper = ejVar.f160921l;
                    String obj = text.toString();
                    C89219l.m154721d(obj, "");
                    baseTitleHelper.f180542c = obj;
                }
                if (ejVar.f160922m != null) {
                    ejVar.f160922m.mo113481a("click_tag_button");
                }
                if (selectionStart >= 0 && !ejVar.f160912c.f166477s) {
                    text.insert(selectionStart, "#");
                }
            }
        }
    }
}
