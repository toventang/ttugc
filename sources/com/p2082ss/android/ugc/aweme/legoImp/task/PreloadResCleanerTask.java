package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.LongSparseArray;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.common.utility.reflect.C13635a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.PreloadResCleanerTask */
public class PreloadResCleanerTask implements AbstractC58264w {
    static {
        Covode.recordClassIndex(68577);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58265x.m105221a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "task_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        return EnumC58151ae.BOOT_FINISH;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    /* renamed from: b */
    private static Context m106398b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        int i = 0;
        if (SettingsManager.m29616a().mo25400a("enable_preload_opt", false)) {
            if (Build.VERSION.SDK_INT >= 24) {
                try {
                    Object a = C13635a.m24534a(m106398b(context).getResources(), "mResourcesImpl");
                    if (a != null) {
                        Object a2 = C13635a.m24534a(a, "sPreloadedDrawables");
                        if (a2 instanceof LongSparseArray[]) {
                            LongSparseArray[] longSparseArrayArr = (LongSparseArray[]) a2;
                            int length = longSparseArrayArr.length;
                            while (i < length) {
                                C13603b.m24434a(longSparseArrayArr[i]);
                                i++;
                            }
                        } else {
                            C13603b.m24434a((LongSparseArray) a2);
                        }
                        C13603b.m24434a(C13635a.m24534a(a, "sPreloadedColorDrawables"));
                        C13603b.m24434a(C13635a.m24534a(a, "sPreloadedComplexColors"));
                        Object a3 = C13635a.m24534a(a, "mDrawableCache");
                        if (a3 != null) {
                            C13603b.m24434a(C13635a.m24534a(a3, "mNullThemedEntries"));
                            C13603b.m24434a(C13635a.m24534a(a3, "mThemedEntries"));
                            C13603b.m24434a(C13635a.m24534a(a3, "mUnthemedEntries"));
                        }
                        C13603b.m24434a(C13635a.m24534a(a, "mDrawableCache"));
                        C13603b.m24434a(C13635a.m24534a(a, "mColorDrawableCache"));
                        C13603b.m24434a(C13635a.m24534a(a, "mColorStateListCache"));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (Build.VERSION.SDK_INT >= 23) {
                try {
                    Resources resources = m106398b(context).getResources();
                    Object a4 = C13635a.m24534a(resources, "sPreloadedDrawables");
                    if (a4 instanceof LongSparseArray[]) {
                        LongSparseArray[] longSparseArrayArr2 = (LongSparseArray[]) a4;
                        int length2 = longSparseArrayArr2.length;
                        while (i < length2) {
                            C13603b.m24434a(longSparseArrayArr2[i]);
                            i++;
                        }
                    } else {
                        C13603b.m24434a((LongSparseArray) a4);
                    }
                    C13603b.m24434a(C13635a.m24534a(resources, "sPreloadedColorDrawables"));
                    C13603b.m24434a(C13635a.m24534a(resources, "sPreloadedColorStateLists"));
                    C13603b.m24434a(C13635a.m24534a(resources, "mDrawableCache"));
                    C13603b.m24434a(C13635a.m24534a(resources, "mColorDrawableCache"));
                    C13603b.m24434a(C13635a.m24534a(resources, "mColorStateListCache"));
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            } else if (Build.VERSION.SDK_INT == 21 || Build.VERSION.SDK_INT == 19) {
                try {
                    Object a5 = C13635a.m24534a(m106398b(context).getResources(), "sPreloadedDrawables");
                    if (a5 instanceof LongSparseArray[]) {
                        LongSparseArray[] longSparseArrayArr3 = (LongSparseArray[]) a5;
                        int length3 = longSparseArrayArr3.length;
                        while (i < length3) {
                            C13603b.m24434a(longSparseArrayArr3[i]);
                            i++;
                        }
                        return;
                    }
                    C13603b.m24434a((LongSparseArray) a5);
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
        }
    }
}
