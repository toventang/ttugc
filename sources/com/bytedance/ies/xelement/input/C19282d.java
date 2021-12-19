package com.bytedance.ies.xelement.input;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnectionWrapper;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.AbstractC89345j;
import p4600h.p4622m.C89350l;

/* renamed from: com.bytedance.ies.xelement.input.d */
public final class C19282d extends InputConnectionWrapper {

    /* renamed from: a */
    public AbstractC19283a f45564a;

    /* renamed from: b */
    C19279c f45565b;

    /* renamed from: c */
    private boolean f45566c;

    /* renamed from: com.bytedance.ies.xelement.input.d$a */
    public interface AbstractC19283a {
        static {
            Covode.recordClassIndex(22062);
        }

        /* renamed from: a */
        boolean mo30677a();
    }

    static {
        Covode.recordClassIndex(22061);
    }

    public C19282d() {
        super(null, true);
    }

    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        AbstractC19283a aVar;
        C89219l.m154719c(keyEvent, "");
        if (keyEvent.getKeyCode() != 67 || keyEvent.getAction() != 0 || (aVar = this.f45564a) == null || !aVar.mo30677a()) {
            return super.sendKeyEvent(keyEvent);
        }
        return true;
    }

    public final boolean commitText(CharSequence charSequence, int i) {
        if (this.f45566c) {
            return true;
        }
        return super.commitText(charSequence, i);
    }

    public final boolean deleteSurroundingText(int i, int i2) {
        AbstractC19283a aVar;
        if (this.f45566c) {
            return true;
        }
        if (i != 1 || i2 != 0 || (aVar = this.f45564a) == null || !aVar.mo30677a()) {
            return super.deleteSurroundingText(i, i2);
        }
        return true;
    }

    public final boolean setComposingText(CharSequence charSequence, int i) {
        if (!this.f45566c) {
            return super.setComposingText(charSequence, i);
        }
        if (charSequence == null || charSequence.length() != 1) {
            return true;
        }
        this.f45566c = false;
        return super.setComposingText(charSequence, i);
    }

    public final boolean setComposingRegion(int i, int i2) {
        int i3;
        int i4;
        Editable text;
        if (i <= i2) {
            i3 = i;
        } else {
            i3 = i2;
        }
        if (i <= i2) {
            i4 = i2;
        } else {
            i4 = i;
        }
        C19279c cVar = this.f45565b;
        if (cVar != null && (text = cVar.getText()) != null && !this.f45566c && i3 >= 0 && i4 <= text.length()) {
            Iterator a = C89350l.findAll$default(new C89350l("(?:[🌀-🗿]|[🤀-🧿]|[😀-🙏]|[🚀-🛿]|[☀-⛿]️?|[✀-➿]️?|Ⓜ️?|[🇦-🇿]{1,2}|[🅰🅱🅾🅿🆎🆑-🆚]️?|[#*0-9]️?⃣|[↔-↙↩-↪]️?|[⬅-⬇⬛⬜⭐⭕]️?|[⤴⤵]️?|[〰〽]️?|[㊗㊙]️?|[🈁🈂🈚🈯🈲-🈺🉐🉑]️?|[‼⁉]️?|[▪▫▶◀◻-◾]️?|[©®]️?|[™ℹ]️?|🀄️?|🃏️?|[⌚⌛⌨⏏⏩-⏳⏸-⏺]️?)"), text.subSequence(i3, i4), 0, 2, null).mo2926a();
            while (a.hasNext()) {
                if (((AbstractC89345j) a.next()).mo143719a().f202928b == (i4 - i3) - 1) {
                    this.f45566c = true;
                    return true;
                }
            }
        }
        return super.setComposingRegion(i, i2);
    }
}
