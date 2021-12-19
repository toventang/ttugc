package com.facebook.drawee.p1855f;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.facebook.drawee.p1854e.C24229q;
import com.facebook.drawee.p1854e.RunnableC24212b;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;

/* renamed from: com.facebook.drawee.f.c */
public final class C24248c {
    static {
        Covode.recordClassIndex(28379);
    }

    /* renamed from: a */
    private static C24250e m46052a(C24247b bVar) {
        if (bVar.f57495t == null) {
            bVar.f57495t = new C24250e();
        }
        return bVar.f57495t;
    }

    /* renamed from: a */
    private static C24229q.AbstractC24231b m46050a(TypedArray typedArray, int i) {
        switch (typedArray.getInt(i, -2)) {
            case -1:
                return null;
            case 0:
                return C24229q.AbstractC24231b.f57452b;
            case 1:
                return C24229q.AbstractC24231b.f57453c;
            case 2:
                return C24229q.AbstractC24231b.f57454d;
            case 3:
                return C24229q.AbstractC24231b.f57455e;
            case 4:
                return C24229q.AbstractC24231b.f57456f;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                return C24229q.AbstractC24231b.f57457g;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                return C24229q.AbstractC24231b.f57458h;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                return C24229q.AbstractC24231b.f57459i;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                return C24229q.AbstractC24231b.f57460j;
            default:
                throw new RuntimeException("XML attribute not specified!");
        }
    }

    /* renamed from: a */
    private static Drawable m46049a(Context context, TypedArray typedArray, int i) {
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        return context.getResources().getDrawable(resourceId);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static C24247b m46051a(C24247b bVar, Context context, AttributeSet attributeSet) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        float f;
        float f2;
        float f3;
        float f4;
        int i2 = 0;
        boolean z5 = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ht, R.attr.jc, R.attr.tq, R.attr.ts, R.attr.tt, R.attr.a6m, R.attr.a7e, R.attr.a7f, R.attr.a7o, R.attr.a7s, R.attr.a7t, R.attr.a7u, R.attr.a9p, R.attr.a9q, R.attr.a_o, R.attr.a_p, R.attr.a_q, R.attr.a_r, R.attr.a_s, R.attr.a_u, R.attr.a_v, R.attr.a_w, R.attr.a_x, R.attr.a_y, R.attr.aa6, R.attr.aa8, R.attr.aa9, R.attr.aa_, R.attr.asz});
            try {
                int indexCount = obtainStyledAttributes.getIndexCount();
                int i3 = 0;
                boolean z6 = true;
                boolean z7 = true;
                boolean z8 = true;
                boolean z9 = true;
                boolean z10 = true;
                boolean z11 = true;
                boolean z12 = true;
                boolean z13 = true;
                i = 0;
                for (int i4 = 0; i4 < indexCount; i4++) {
                    int index = obtainStyledAttributes.getIndex(i4);
                    if (index == 0) {
                        bVar.mo39976a(m46050a(obtainStyledAttributes, index));
                    } else if (index == 6) {
                        bVar.f57481f = m46049a(context, obtainStyledAttributes, index);
                    } else if (index == 8) {
                        bVar.mo39975a(m46049a(context, obtainStyledAttributes, index));
                    } else if (index == 10) {
                        bVar.f57487l = m46049a(context, obtainStyledAttributes, index);
                    } else if (index == 2) {
                        int i5 = z5 ? 1 : 0;
                        int i6 = z5 ? 1 : 0;
                        int i7 = z5 ? 1 : 0;
                        int i8 = z5 ? 1 : 0;
                        int i9 = z5 ? 1 : 0;
                        int i10 = z5 ? 1 : 0;
                        int i11 = z5 ? 1 : 0;
                        int i12 = z5 ? 1 : 0;
                        bVar.f57479d = obtainStyledAttributes.getInt(index, i5);
                    } else if (index == 28) {
                        bVar.f57480e = obtainStyledAttributes.getFloat(index, 0.0f);
                    } else if (index == 7) {
                        bVar.f57482g = m46050a(obtainStyledAttributes, index);
                    } else if (index == 12) {
                        bVar.f57483h = m46049a(context, obtainStyledAttributes, index);
                    } else if (index == 13) {
                        bVar.f57484i = m46050a(obtainStyledAttributes, index);
                    } else if (index == 3) {
                        bVar.f57485j = m46049a(context, obtainStyledAttributes, index);
                    } else if (index == 4) {
                        bVar.f57486k = m46050a(obtainStyledAttributes, index);
                    } else if (index == 11) {
                        bVar.f57488m = m46050a(obtainStyledAttributes, index);
                    } else if (index == 9) {
                        obtainStyledAttributes = obtainStyledAttributes;
                        i3 = obtainStyledAttributes.getInteger(index, i3);
                    } else if (index == 1) {
                        bVar.f57492q = m46049a(context, obtainStyledAttributes, index);
                    } else if (index == 5) {
                        Drawable a = m46049a(context, obtainStyledAttributes, index);
                        if (a == null) {
                            bVar.f57493r = null;
                        } else {
                            Drawable[] drawableArr = new Drawable[1];
                            char c = z5 ? 1 : 0;
                            char c2 = z5 ? 1 : 0;
                            char c3 = z5 ? 1 : 0;
                            char c4 = z5 ? 1 : 0;
                            char c5 = z5 ? 1 : 0;
                            char c6 = z5 ? 1 : 0;
                            char c7 = z5 ? 1 : 0;
                            char c8 = z5 ? 1 : 0;
                            drawableArr[c] = a;
                            bVar.f57493r = Arrays.asList(drawableArr);
                        }
                    } else if (index == 14) {
                        m46052a(bVar).f57500b = obtainStyledAttributes.getBoolean(index, z5);
                    } else if (index == 24) {
                        i = obtainStyledAttributes.getDimensionPixelSize(index, i);
                    } else if (index == 20) {
                        z6 = obtainStyledAttributes.getBoolean(index, z6);
                    } else if (index == 21) {
                        z8 = obtainStyledAttributes.getBoolean(index, z8);
                    } else if (index == 16) {
                        z12 = obtainStyledAttributes.getBoolean(index, z12);
                    } else if (index == 17) {
                        z10 = obtainStyledAttributes.getBoolean(index, z10);
                    } else if (index == 22) {
                        z7 = obtainStyledAttributes.getBoolean(index, z7);
                    } else if (index == 19) {
                        z9 = obtainStyledAttributes.getBoolean(index, z9);
                    } else if (index == 18) {
                        z13 = obtainStyledAttributes.getBoolean(index, z13);
                    } else if (index == 15) {
                        z11 = obtainStyledAttributes.getBoolean(index, z11);
                        z5 = false;
                    } else {
                        if (index == 23) {
                            m46052a(bVar).mo39980a(obtainStyledAttributes.getColor(index, 0));
                        } else if (index == 27) {
                            m46052a(bVar).mo39985c((float) obtainStyledAttributes.getDimensionPixelSize(index, 0));
                        } else if (index == 25) {
                            m46052a(bVar).f57504f = obtainStyledAttributes.getColor(index, 0);
                        } else if (index == 26) {
                            z5 = false;
                            m46052a(bVar).mo39986d((float) obtainStyledAttributes.getDimensionPixelSize(index, 0));
                        }
                        z5 = false;
                    }
                }
                obtainStyledAttributes.recycle();
                int i13 = Build.VERSION.SDK_INT;
                if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
                    if (!z6 || !z9) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (!z8 || !z7) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (!z10 || !z13) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z12 && z11) {
                        z5 = true;
                    }
                } else {
                    if (!z6 || !z7) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (!z8 || !z9) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (!z10 || !z11) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z12 && z13) {
                        z5 = true;
                    }
                }
                boolean z14 = z5 ? 1 : 0;
                Object[] objArr = z5 ? 1 : 0;
                Object[] objArr2 = z5 ? 1 : 0;
                Object[] objArr3 = z5 ? 1 : 0;
                Object[] objArr4 = z5 ? 1 : 0;
                Object[] objArr5 = z5 ? 1 : 0;
                Object[] objArr6 = z5 ? 1 : 0;
                Object[] objArr7 = z5 ? 1 : 0;
                z = z14;
                i2 = i3;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                int i14 = Build.VERSION.SDK_INT;
                context.getResources().getConfiguration().getLayoutDirection();
                throw th;
            }
        } else {
            z4 = true;
            i = 0;
            z2 = true;
            z3 = true;
            z = true;
        }
        if (bVar.f57487l != null && i2 > 0) {
            bVar.f57487l = new RunnableC24212b(bVar.f57487l, i2);
        }
        if (i > 0) {
            C24250e a2 = m46052a(bVar);
            if (z3) {
                f = (float) i;
            } else {
                f = 0.0f;
            }
            if (z4) {
                f2 = (float) i;
            } else {
                f2 = 0.0f;
            }
            if (z2) {
                f3 = (float) i;
            } else {
                f3 = 0.0f;
            }
            if (z) {
                f4 = (float) i;
            } else {
                f4 = 0.0f;
            }
            a2.mo39979a(f, f2, f3, f4);
        }
        return bVar;
    }
}
