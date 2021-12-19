package com.twitter.sdk.android.core.identity;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.Button;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import com.twitter.sdk.android.core.AbstractC87682b;
import com.twitter.sdk.android.core.AbstractC87688f;
import com.twitter.sdk.android.core.C87794k;
import com.twitter.sdk.android.core.C87808q;
import com.twitter.sdk.android.core.C87814u;
import java.lang.ref.WeakReference;

/* renamed from: com.twitter.sdk.android.core.identity.h */
public class C87705h extends Button {

    /* renamed from: a */
    final WeakReference<Activity> f199218a;

    /* renamed from: b */
    volatile TwitterAuthClient f199219b;

    /* renamed from: c */
    View.OnClickListener f199220c;

    /* renamed from: d */
    AbstractC87682b<C87814u> f199221d;

    static {
        Covode.recordClassIndex(103694);
    }

    public AbstractC87682b<C87814u> getCallback() {
        return this.f199221d;
    }

    public TwitterAuthClient getTwitterAuthClient() {
        MethodCollector.m26663i(5833);
        if (this.f199219b == null) {
            synchronized (C87705h.class) {
                try {
                    if (this.f199219b == null) {
                        this.f199219b = new TwitterAuthClient();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5833);
                    throw th;
                }
            }
        }
        TwitterAuthClient twitterAuthClient = this.f199219b;
        MethodCollector.m26664o(5833);
        return twitterAuthClient;
    }

    /* access modifiers changed from: protected */
    public Activity getActivity() {
        if ((getContext() instanceof ContextThemeWrapper) && (((ContextThemeWrapper) getContext()).getBaseContext() instanceof Activity)) {
            return (Activity) ((ContextThemeWrapper) getContext()).getBaseContext();
        }
        if (getContext() instanceof Activity) {
            return (Activity) getContext();
        }
        if (isInEditMode()) {
            return null;
        }
        throw new IllegalStateException("TwitterLoginButton requires an activity. Override getActivity to provide the activity for this button.");
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f199220c = onClickListener;
    }

    /* renamed from: com.twitter.sdk.android.core.identity.h$a */
    class View$OnClickListenerC87706a implements View.OnClickListener {
        static {
            Covode.recordClassIndex(103695);
        }

        private View$OnClickListenerC87706a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b4, code lost:
            if (r5.f199198b.mo142140a(r4, new com.twitter.sdk.android.core.identity.C87704g(r5.f199200d, r3)) == false) goto L_0x00b6;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r9) {
            /*
            // Method dump skipped, instructions count: 232
            */
            throw new UnsupportedOperationException("Method not decompiled: com.twitter.sdk.android.core.identity.C87705h.View$OnClickListenerC87706a.onClick(android.view.View):void");
        }

        /* synthetic */ View$OnClickListenerC87706a(C87705h hVar, byte b) {
            this();
        }
    }

    public C87705h(Context context) {
        this(context, (byte) 0);
    }

    public void setCallback(AbstractC87682b<C87814u> bVar) {
        if (bVar != null) {
            this.f199221d = bVar;
            return;
        }
        throw new IllegalArgumentException("Callback cannot be null");
    }

    private C87705h(Context context, byte b) {
        this(context, (char) 0);
    }

    private C87705h(Context context, char c) {
        this(context, (AttributeSet) null);
    }

    private C87705h(Context context, AttributeSet attributeSet) {
        super(context, null, 16842824);
        MethodCollector.m26663i(5699);
        this.f199218a = new WeakReference<>(getActivity());
        this.f199219b = null;
        Resources resources = getResources();
        super.setCompoundDrawablesWithIntrinsicBounds(resources.getDrawable(2131234914), (Drawable) null, (Drawable) null, (Drawable) null);
        super.setCompoundDrawablePadding(resources.getDimensionPixelSize(2131166195));
        super.setText(R.string.gx4);
        super.setTextColor(resources.getColor(R.color.a22));
        super.setTextSize(0, (float) resources.getDimensionPixelSize(2131166200));
        super.setTypeface(Typeface.DEFAULT_BOLD);
        super.setPadding(resources.getDimensionPixelSize(2131166197), 0, resources.getDimensionPixelSize(2131166199), 0);
        super.setBackgroundResource(R.drawable.cbi);
        super.setOnClickListener(new View$OnClickListenerC87706a(this, (byte) 0));
        if (Build.VERSION.SDK_INT >= 21) {
            super.setAllCaps(false);
        }
        if (!isInEditMode()) {
            try {
                C87808q.m152816a();
                MethodCollector.m26664o(5699);
                return;
            } catch (IllegalStateException e) {
                AbstractC87688f c = C87794k.m152811c();
                e.getMessage();
                c.mo142115d();
                setEnabled(false);
            }
        }
        MethodCollector.m26664o(5699);
    }
}
