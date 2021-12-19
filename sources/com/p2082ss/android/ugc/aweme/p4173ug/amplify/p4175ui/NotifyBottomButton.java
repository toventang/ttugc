package com.p2082ss.android.ugc.aweme.p4173ug.amplify.p4175ui;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ug.amplify.ui.NotifyBottomButton */
public final class NotifyBottomButton extends RelativeLayout {

    /* renamed from: a */
    public TextView f178548a;

    /* renamed from: b */
    public TextView f178549b;

    static {
        Covode.recordClassIndex(92774);
    }

    public NotifyBottomButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.amplify.ui.NotifyBottomButton$a */
    static final class RunnableC79567a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ NotifyBottomButton f178550a;

        /* renamed from: b */
        final /* synthetic */ String f178551b;

        /* renamed from: c */
        final /* synthetic */ String f178552c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89172b f178553d;

        /* renamed from: e */
        final /* synthetic */ AbstractC89172b f178554e;

        static {
            Covode.recordClassIndex(92775);
        }

        RunnableC79567a(NotifyBottomButton notifyBottomButton, String str, String str2, AbstractC89172b bVar, AbstractC89172b bVar2) {
            this.f178550a = notifyBottomButton;
            this.f178551b = str;
            this.f178552c = str2;
            this.f178553d = bVar;
            this.f178554e = bVar2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x00a7  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x00b5  */
        /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 197
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p4173ug.amplify.p4175ui.NotifyBottomButton.RunnableC79567a.run():void");
        }
    }

    /* renamed from: a */
    static Float m138325a(TextView textView) {
        TextPaint paint;
        if (textView == null || (paint = textView.getPaint()) == null) {
            return null;
        }
        return Float.valueOf(paint.measureText(textView.getText().toString()) + ((float) textView.getPaddingLeft()) + ((float) textView.getPaddingRight()));
    }

    private /* synthetic */ NotifyBottomButton(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private NotifyBottomButton(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(8524);
        MethodCollector.m26664o(8524);
    }
}
