package com.bytedance.apm.agent.p757v2.instrumentation;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.C12397c;
import com.bytedance.apm.agent.monitor.MonitorTool;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.p788p.C12559a;
import com.bytedance.apm.p788p.C12560b;
import com.bytedance.apm.trace.p792c.C12632a;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.agent.v2.instrumentation.FragmentTimeAgent */
public class FragmentTimeAgent {
    public static long sCheckVisibilityStartTime;
    public static String sFragmentName;
    public static long sMaxWaitTime = 60000;
    public static HashSet<String> sMethodSet = new HashSet<>(32);
    private static long sOnActivityCreatedEnd;
    private static long sOnActivityCreatedStart;
    private static long sOnCreateEnd;
    private static long sOnCreateStart;
    public static ViewTreeObserver.OnGlobalLayoutListener sOnGlobalLayoutListener;
    private static long sOnResumeEnd;
    private static long sOnResumeStart;
    private static long sOnViewCreatedEnd;
    private static long sOnViewCreatedStart;
    private static boolean sReported;
    public static WeakReference<View> sRootViewRef;
    public static Runnable sWaitViewTimeoutRunnable;

    static {
        Covode.recordClassIndex(14087);
    }

    private static boolean isValid(String str) {
        if (sReported || !TextUtils.equals(str, sFragmentName)) {
            return false;
        }
        return true;
    }

    public static void onHiddenChanged(Fragment fragment, boolean z) {
        if (!z) {
            try {
                String canonicalName = fragment.getClass().getCanonicalName();
                Integer a = C12632a.m22760a(canonicalName);
                if (a == null) {
                    return;
                }
                if (a.intValue() > 0) {
                    registerOnGlobalLayoutListener(canonicalName, fragment.getView(), a, System.currentTimeMillis(), "fragmentOnHiddenChangedToViewShow");
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void onResumeShow(Fragment fragment, String str) {
        if (fragment.getUserVisibleHint() && !fragment.isHidden()) {
            try {
                Integer a = C12632a.m22760a(str);
                if (a == null) {
                    return;
                }
                if (a.intValue() > 0) {
                    registerOnGlobalLayoutListener(str, fragment.getView(), a, sOnCreateStart, "fragmentOnCreateToViewShow");
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void setUserVisibleHint(Fragment fragment, boolean z) {
        if (z && fragment.isResumed() && !fragment.isHidden()) {
            try {
                String canonicalName = fragment.getClass().getCanonicalName();
                Integer a = C12632a.m22760a(canonicalName);
                if (a == null) {
                    return;
                }
                if (a.intValue() > 0) {
                    registerOnGlobalLayoutListener(canonicalName, fragment.getView(), a, System.currentTimeMillis(), "fragmentUserVisibleToViewShow");
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void reportTraceTime(String str, final String str2, final long j, final long j2) {
        C12560b.C12564a.f30567a.mo20387a(new Runnable() {
            /* class com.bytedance.apm.agent.p757v2.instrumentation.FragmentTimeAgent.RunnableC122872 */

            static {
                Covode.recordClassIndex(14089);
            }

            public final void run() {
                boolean contains = FragmentTimeAgent.sMethodSet.contains(FragmentTimeAgent.sFragmentName);
                FragmentTimeAgent.sMethodSet.add(FragmentTimeAgent.sFragmentName);
                FragmentTimeAgent.reportStats(contains, str2, j, j2);
            }
        });
    }

    public static void onTrace(Fragment fragment, String str, String str2, boolean z) {
        if (TextUtils.equals("onCreate", str2)) {
            if (z) {
                sFragmentName = str;
                sOnCreateStart = System.currentTimeMillis();
                if (sMaxWaitTime == 0) {
                    sMaxWaitTime = ApmDelegate.C12507a.f30372a.mo20330b().f30035c;
                }
                sReported = false;
            } else if (isValid(str)) {
                sOnCreateEnd = System.currentTimeMillis();
            }
        } else if (!TextUtils.equals("onViewCreated", str2) || !isValid(str)) {
            if (!TextUtils.equals("onActivityCreated", str2) || !isValid(str)) {
                if (TextUtils.equals("onResume", str2) && isValid(str)) {
                    if (z) {
                        if (sOnCreateStart > 0) {
                            sOnResumeStart = System.currentTimeMillis();
                            onResumeShow(fragment, str);
                        }
                    } else if (sOnCreateStart > 0) {
                        sOnResumeEnd = System.currentTimeMillis();
                        try {
                            Integer a = C12632a.m22760a(str);
                            if (a == null || a.intValue() <= 0) {
                                C12560b.C12564a.f30567a.mo20387a(new Runnable() {
                                    /* class com.bytedance.apm.agent.p757v2.instrumentation.FragmentTimeAgent.RunnableC122861 */

                                    static {
                                        Covode.recordClassIndex(14088);
                                    }

                                    public final void run() {
                                        boolean contains = FragmentTimeAgent.sMethodSet.contains(FragmentTimeAgent.sFragmentName);
                                        FragmentTimeAgent.sMethodSet.add(FragmentTimeAgent.sFragmentName);
                                        FragmentTimeAgent.reportStats(contains, null, 0, 0);
                                    }
                                });
                            }
                        } catch (Exception unused) {
                        }
                        sReported = true;
                        sFragmentName = null;
                    }
                }
            } else if (z) {
                if (sOnCreateStart > 0) {
                    sOnActivityCreatedStart = System.currentTimeMillis();
                }
            } else if (sOnCreateStart > 0) {
                sOnActivityCreatedEnd = System.currentTimeMillis();
            }
        } else if (z) {
            if (sOnCreateStart > 0) {
                sOnViewCreatedStart = System.currentTimeMillis();
            }
        } else if (sOnCreateStart > 0) {
            sOnViewCreatedEnd = System.currentTimeMillis();
        }
    }

    public static void reportStats(boolean z, String str, long j, long j2) {
        int i;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(StringSet.name, "onCreate");
            jSONObject.put("start", sOnCreateStart);
            jSONObject.put("end", sOnCreateEnd);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(StringSet.name, "onViewCreated");
            jSONObject2.put("start", sOnViewCreatedStart);
            jSONObject2.put("end", sOnViewCreatedEnd);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(StringSet.name, "onActivityCreated");
            jSONObject3.put("start", sOnActivityCreatedStart);
            jSONObject3.put("end", sOnActivityCreatedEnd);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put(StringSet.name, "onResume");
            jSONObject4.put("start", sOnResumeStart);
            jSONObject4.put("end", sOnResumeEnd);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            jSONArray.put(jSONObject2);
            jSONArray.put(jSONObject3);
            jSONArray.put(jSONObject4);
            if (str != null) {
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put(StringSet.name, str);
                jSONObject5.put("start", j);
                jSONObject5.put("end", j2);
                jSONArray.put(jSONObject5);
            }
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put(StringSet.name, "page_load_stats");
            jSONObject6.put("page_type", "fragment");
            jSONObject6.put("start", sOnCreateStart);
            jSONObject6.put("spans", jSONArray);
            if (z) {
                i = 2;
            } else {
                i = 1;
            }
            jSONObject6.put("launch_mode", i);
            jSONObject6.put("collect_from", 1);
            jSONObject6.put("page_name", sFragmentName);
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("trace", jSONObject6);
            MonitorTool.monitorPerformance("page_load_trace", null, null, jSONObject7);
        } catch (Exception e) {
            if (C12397c.m22288e()) {
                e.printStackTrace();
            }
        }
    }

    private static void registerOnGlobalLayoutListener(String str, View view, final Integer num, final long j, final String str2) {
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
        if (num != null && num.intValue() > 0) {
            sFragmentName = str;
            WeakReference<View> weakReference = sRootViewRef;
            if (!(weakReference == null || weakReference.get() == view)) {
                ViewTreeObserver viewTreeObserver = sRootViewRef.get().getViewTreeObserver();
                if (viewTreeObserver.isAlive() && (onGlobalLayoutListener = sOnGlobalLayoutListener) != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
                }
                if (sWaitViewTimeoutRunnable != null) {
                    C12559a.f30553a.removeCallbacks(sWaitViewTimeoutRunnable);
                }
            }
            sRootViewRef = new WeakReference<>(view);
            sCheckVisibilityStartTime = 0;
            sOnGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() {
                /* class com.bytedance.apm.agent.p757v2.instrumentation.FragmentTimeAgent.ViewTreeObserver$OnGlobalLayoutListenerC122883 */

                static {
                    Covode.recordClassIndex(14090);
                }

                public final void onGlobalLayout() {
                    try {
                        if (FragmentTimeAgent.sRootViewRef == null) {
                            return;
                        }
                        if (FragmentTimeAgent.sRootViewRef.get() != null) {
                            View findViewById = FragmentTimeAgent.sRootViewRef.get().findViewById(num.intValue());
                            if (FragmentTimeAgent.sCheckVisibilityStartTime == 0) {
                                FragmentTimeAgent.sCheckVisibilityStartTime = System.currentTimeMillis();
                            }
                            if (findViewById != null && findViewById.getVisibility() == 0 && findViewById.getWidth() > 0) {
                                long currentTimeMillis = System.currentTimeMillis();
                                if (FragmentTimeAgent.sRootViewRef.get().getViewTreeObserver().isAlive() && FragmentTimeAgent.sOnGlobalLayoutListener != null) {
                                    FragmentTimeAgent.sRootViewRef.get().getViewTreeObserver().removeOnGlobalLayoutListener(FragmentTimeAgent.sOnGlobalLayoutListener);
                                }
                                FragmentTimeAgent.sOnGlobalLayoutListener = null;
                                FragmentTimeAgent.sRootViewRef = null;
                                if (FragmentTimeAgent.sWaitViewTimeoutRunnable != null) {
                                    C12559a.f30553a.removeCallbacks(FragmentTimeAgent.sWaitViewTimeoutRunnable);
                                }
                                long j = currentTimeMillis - j;
                                if (currentTimeMillis - FragmentTimeAgent.sCheckVisibilityStartTime > 1 && j < FragmentTimeAgent.sMaxWaitTime) {
                                    FragmentTimeAgent.reportTraceTime(FragmentTimeAgent.sFragmentName, str2, j, currentTimeMillis);
                                }
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            };
            view.getViewTreeObserver().addOnGlobalLayoutListener(sOnGlobalLayoutListener);
            sWaitViewTimeoutRunnable = new Runnable() {
                /* class com.bytedance.apm.agent.p757v2.instrumentation.FragmentTimeAgent.RunnableC122894 */

                static {
                    Covode.recordClassIndex(14091);
                }

                public final void run() {
                    try {
                        if (FragmentTimeAgent.sOnGlobalLayoutListener != null && FragmentTimeAgent.sRootViewRef != null && FragmentTimeAgent.sRootViewRef.get() != null) {
                            FragmentTimeAgent.sRootViewRef.get().getViewTreeObserver().removeOnGlobalLayoutListener(FragmentTimeAgent.sOnGlobalLayoutListener);
                        }
                    } catch (Exception unused) {
                    }
                }
            };
            C12559a.f30553a.postDelayed(sWaitViewTimeoutRunnable, sMaxWaitTime);
        }
    }
}
