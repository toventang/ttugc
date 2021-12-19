package com.facebook;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import androidx.core.content.C0643b;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.facebook.internal.C24776s;
import com.facebook.internal.p1894a.p1896b.C24677a;
import com.facebook.p1814a.C23998m;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.facebook.g */
public abstract class AbstractC24309g extends Button {

    /* renamed from: a */
    String f57629a;

    /* renamed from: b */
    public View.OnClickListener f57630b;

    /* renamed from: c */
    private String f57631c;

    /* renamed from: d */
    private View.OnClickListener f57632d;

    /* renamed from: e */
    private boolean f57633e;

    /* renamed from: f */
    private int f57634f;

    /* renamed from: g */
    private int f57635g;

    /* renamed from: h */
    private C24776s f57636h;

    static {
        Covode.recordClassIndex(28442);
    }

    /* access modifiers changed from: protected */
    public abstract int getDefaultRequestCode();

    /* access modifiers changed from: protected */
    public int getDefaultStyleResource() {
        C24677a.m47209a(this);
        return 0;
    }

    public int getCompoundPaddingLeft() {
        if (C24677a.m47209a(this)) {
            return 0;
        }
        try {
            if (this.f57633e) {
                return this.f57634f;
            }
            return super.getCompoundPaddingLeft();
        } catch (Throwable th) {
            C24677a.m47208a(th, this);
            return 0;
        }
    }

    public int getCompoundPaddingRight() {
        if (C24677a.m47209a(this)) {
            return 0;
        }
        try {
            if (this.f57633e) {
                return this.f57635g;
            }
            return super.getCompoundPaddingRight();
        } catch (Throwable th) {
            C24677a.m47208a(th, this);
            return 0;
        }
    }

    public Fragment getFragment() {
        if (C24677a.m47209a(this)) {
            return null;
        }
        try {
            C24776s sVar = this.f57636h;
            if (sVar != null) {
                return sVar.f58795a;
            }
            return null;
        } catch (Throwable th) {
            C24677a.m47208a(th, this);
            return null;
        }
    }

    public android.app.Fragment getNativeFragment() {
        if (C24677a.m47209a(this)) {
            return null;
        }
        try {
            C24776s sVar = this.f57636h;
            if (sVar != null) {
                return sVar.f58796b;
            }
            return null;
        } catch (Throwable th) {
            C24677a.m47208a(th, this);
            return null;
        }
    }

    public int getRequestCode() {
        if (C24677a.m47209a(this)) {
            return 0;
        }
        try {
            return getDefaultRequestCode();
        } catch (Throwable th) {
            C24677a.m47208a(th, this);
            return 0;
        }
    }

    public Activity getActivity() {
        if (C24677a.m47209a(this)) {
            return null;
        }
        try {
            Context context = getContext();
            while (!(context instanceof Activity) && (context instanceof ContextWrapper)) {
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (context instanceof Activity) {
                return (Activity) context;
            }
            throw new C24798j("Unable to get Activity.");
        } catch (Throwable th) {
            C24677a.m47208a(th, this);
            return null;
        }
    }

    public void onAttachedToWindow() {
        if (!C24677a.m47209a(this)) {
            try {
                super.onAttachedToWindow();
                if (!isInEditMode()) {
                    Context context = getContext();
                    if (!C24677a.m47209a(this)) {
                        try {
                            new C23998m(context).mo39476b();
                        } catch (Throwable th) {
                            C24677a.m47208a(th, this);
                        }
                    }
                }
            } catch (Throwable th2) {
                C24677a.m47208a(th2, this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void setInternalOnClickListener(View.OnClickListener onClickListener) {
        if (!C24677a.m47209a(this)) {
            try {
                this.f57632d = onClickListener;
            } catch (Throwable th) {
                C24677a.m47208a(th, this);
            }
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        if (!C24677a.m47209a(this)) {
            try {
                this.f57630b = onClickListener;
            } catch (Throwable th) {
                C24677a.m47208a(th, this);
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ View.OnClickListener m46255a(AbstractC24309g gVar) {
        if (C24677a.m47209a(AbstractC24309g.class)) {
            return null;
        }
        try {
            return gVar.f57632d;
        } catch (Throwable th) {
            C24677a.m47208a(th, AbstractC24309g.class);
            return null;
        }
    }

    /* renamed from: b */
    static /* synthetic */ View.OnClickListener m46256b(AbstractC24309g gVar) {
        if (C24677a.m47209a(AbstractC24309g.class)) {
            return null;
        }
        try {
            return gVar.f57630b;
        } catch (Throwable th) {
            C24677a.m47208a(th, AbstractC24309g.class);
            return null;
        }
    }

    public void setFragment(android.app.Fragment fragment) {
        if (!C24677a.m47209a(this)) {
            try {
                this.f57636h = new C24776s(fragment);
            } catch (Throwable th) {
                C24677a.m47208a(th, this);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo40092a(String str) {
        if (C24677a.m47209a(this)) {
            return 0;
        }
        try {
            return (int) Math.ceil((double) getPaint().measureText(str));
        } catch (Throwable th) {
            C24677a.m47208a(th, this);
            return 0;
        }
    }

    public void setFragment(Fragment fragment) {
        if (!C24677a.m47209a(this)) {
            try {
                this.f57636h = new C24776s(fragment);
            } catch (Throwable th) {
                C24677a.m47208a(th, this);
            }
        }
    }

    public void onDraw(Canvas canvas) {
        if (!C24677a.m47209a(this)) {
            try {
                if ((getGravity() & 1) != 0) {
                    int compoundPaddingLeft = getCompoundPaddingLeft();
                    int compoundPaddingRight = getCompoundPaddingRight();
                    int min = Math.min((((getWidth() - (getCompoundDrawablePadding() + compoundPaddingLeft)) - compoundPaddingRight) - mo40092a(getText().toString())) / 2, (compoundPaddingLeft - getPaddingLeft()) / 2);
                    this.f57634f = compoundPaddingLeft - min;
                    this.f57635g = compoundPaddingRight + min;
                    this.f57633e = true;
                }
                super.onDraw(canvas);
                this.f57633e = false;
            } catch (Throwable th) {
                C24677a.m47208a(th, this);
            }
        }
    }

    public AbstractC24309g(Context context, String str, String str2) {
        super(context, null, 0);
        int defaultStyleResource = getDefaultStyleResource();
        mo40093a(context, null, 0, defaultStyleResource == 0 ? R.style.vg : defaultStyleResource);
        this.f57631c = str;
        this.f57629a = str2;
        setClickable(true);
        setFocusable(true);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public void mo40093a(Context context, AttributeSet attributeSet, int i, int i2) {
        if (!C24677a.m47209a(this)) {
            try {
                if (!C24677a.m47209a(this)) {
                    try {
                        if (!isInEditMode()) {
                            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842964}, i, i2);
                            try {
                                if (obtainStyledAttributes.hasValue(0)) {
                                    int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                                    if (resourceId != 0) {
                                        setBackgroundResource(resourceId);
                                    } else {
                                        setBackgroundColor(obtainStyledAttributes.getColor(0, 0));
                                    }
                                } else {
                                    setBackgroundColor(C0643b.m2378c(context, R.color.fk));
                                }
                            } finally {
                                obtainStyledAttributes.recycle();
                            }
                        }
                    } catch (Throwable th) {
                        C24677a.m47208a(th, this);
                    }
                }
                if (!C24677a.m47209a(this)) {
                    try {
                        TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16843119, 16843117, 16843120, 16843118, 16843121}, i, i2);
                        try {
                            setCompoundDrawablesWithIntrinsicBounds(obtainStyledAttributes2.getResourceId(0, 0), obtainStyledAttributes2.getResourceId(1, 0), obtainStyledAttributes2.getResourceId(2, 0), obtainStyledAttributes2.getResourceId(3, 0));
                            setCompoundDrawablePadding(obtainStyledAttributes2.getDimensionPixelSize(4, 0));
                        } finally {
                            obtainStyledAttributes2.recycle();
                        }
                    } catch (Throwable th2) {
                        C24677a.m47208a(th2, this);
                    }
                }
                if (!C24677a.m47209a(this)) {
                    try {
                        TypedArray obtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842966, 16842967, 16842968, 16842969}, i, i2);
                        try {
                            setPadding(obtainStyledAttributes3.getDimensionPixelSize(0, 0), obtainStyledAttributes3.getDimensionPixelSize(1, 0), obtainStyledAttributes3.getDimensionPixelSize(2, 0), obtainStyledAttributes3.getDimensionPixelSize(3, 0));
                        } finally {
                            obtainStyledAttributes3.recycle();
                        }
                    } catch (Throwable th3) {
                        C24677a.m47208a(th3, this);
                    }
                }
                if (!C24677a.m47209a(this)) {
                    try {
                        TypedArray obtainStyledAttributes4 = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842904}, i, i2);
                        try {
                            setTextColor(obtainStyledAttributes4.getColorStateList(0));
                            obtainStyledAttributes4.recycle();
                            TypedArray obtainStyledAttributes5 = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842927}, i, i2);
                            try {
                                setGravity(obtainStyledAttributes5.getInt(0, 17));
                                obtainStyledAttributes5.recycle();
                                TypedArray obtainStyledAttributes6 = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842901, 16842903, 16843087}, i, i2);
                                try {
                                    setTextSize(0, (float) obtainStyledAttributes6.getDimensionPixelSize(0, 0));
                                    setTypeface(Typeface.defaultFromStyle(obtainStyledAttributes6.getInt(1, 1)));
                                    setText(obtainStyledAttributes6.getString(2));
                                } finally {
                                    obtainStyledAttributes6.recycle();
                                }
                            } catch (Throwable th4) {
                                obtainStyledAttributes5.recycle();
                                throw th4;
                            }
                        } catch (Throwable th5) {
                            obtainStyledAttributes4.recycle();
                            throw th5;
                        }
                    } catch (Throwable th6) {
                        C24677a.m47208a(th6, this);
                    }
                }
                if (!C24677a.m47209a(this)) {
                    try {
                        super.setOnClickListener(new View.OnClickListener() {
                            /* class com.facebook.AbstractC24309g.View$OnClickListenerC243101 */

                            static {
                                Covode.recordClassIndex(28443);
                            }

                            public final void onClick(View view) {
                                if (!C24677a.m47209a(this)) {
                                    try {
                                        AbstractC24309g gVar = AbstractC24309g.this;
                                        Context context = gVar.getContext();
                                        if (!C24677a.m47209a(AbstractC24309g.class)) {
                                            try {
                                                if (!C24677a.m47209a(gVar)) {
                                                    try {
                                                        new C23998m(context).mo39476b();
                                                    } catch (Throwable th) {
                                                        C24677a.m47208a(th, gVar);
                                                    }
                                                }
                                            } catch (Throwable th2) {
                                                C24677a.m47208a(th2, AbstractC24309g.class);
                                            }
                                        }
                                        if (AbstractC24309g.m46255a(AbstractC24309g.this) != null) {
                                            AbstractC24309g.m46255a(AbstractC24309g.this).onClick(view);
                                        } else if (AbstractC24309g.m46256b(AbstractC24309g.this) != null) {
                                            AbstractC24309g.m46256b(AbstractC24309g.this).onClick(view);
                                        }
                                    } catch (Throwable th3) {
                                        C24677a.m47208a(th3, this);
                                    }
                                }
                            }
                        });
                    } catch (Throwable th7) {
                        C24677a.m47208a(th7, this);
                    }
                }
            } catch (Throwable th8) {
                C24677a.m47208a(th8, this);
            }
        }
    }
}
