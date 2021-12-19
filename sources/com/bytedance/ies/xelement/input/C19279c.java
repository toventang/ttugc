package com.bytedance.ies.xelement.input;

import android.content.Context;
import android.view.MotionEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.AppCompatEditText;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.input.C19282d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xelement.input.c */
public final class C19279c extends AppCompatEditText {

    /* renamed from: c */
    public static final C19280a f45560c = new C19280a((byte) 0);

    /* renamed from: a */
    C19282d f45561a;

    /* renamed from: b */
    AbstractC19281b f45562b;

    /* renamed from: d */
    private boolean f45563d;

    /* renamed from: com.bytedance.ies.xelement.input.c$b */
    public interface AbstractC19281b {
        static {
            Covode.recordClassIndex(22060);
        }

        /* renamed from: a */
        boolean mo30678a();
    }

    static {
        Covode.recordClassIndex(22058);
    }

    /* renamed from: com.bytedance.ies.xelement.input.c$a */
    public static final class C19280a {
        static {
            Covode.recordClassIndex(22059);
        }

        private C19280a() {
        }

        public /* synthetic */ C19280a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final C19282d mo30688a() {
        if (!this.f45563d) {
            return null;
        }
        return this.f45561a;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IndexOutOfBoundsException unused) {
            return true;
        }
    }

    public final void setBackSpaceListener(C19282d.AbstractC19283a aVar) {
        C19282d dVar = this.f45561a;
        if (dVar != null) {
            dVar.f45564a = aVar;
        }
    }

    public final void setCopyListener(AbstractC19281b bVar) {
        C89219l.m154719c(bVar, "");
        this.f45562b = bVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19279c(Context context) {
        super(context);
        C89219l.m154719c(context, "");
        C19282d dVar = new C19282d();
        this.f45561a = dVar;
        C89219l.m154719c(this, "");
        dVar.f45565b = this;
    }

    @Override // androidx.appcompat.widget.AppCompatEditText
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null) {
            return null;
        }
        try {
            C19282d dVar = this.f45561a;
            if (dVar != null) {
                dVar.setTarget(onCreateInputConnection);
            }
            this.f45563d = true;
            return this.f45561a;
        } catch (SecurityException unused) {
            return null;
        }
    }

    public final boolean onTextContextMenuItem(int i) {
        if (i != 16908321) {
            return super.onTextContextMenuItem(i);
        }
        AbstractC19281b bVar = this.f45562b;
        if (bVar != null) {
            return bVar.mo30678a();
        }
        return super.onTextContextMenuItem(i);
    }
}
