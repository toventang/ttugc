package com.p2082ss.android.ugc.aweme.tux.business.p4170a;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.p084a.p088b.p089a.C1863a;
import com.p084a.p088b.p090b.C1869a;
import com.p2082ss.android.ugc.aweme.tux.business.story.EnumC79475a;
import com.p2082ss.android.ugc.aweme.tux.business.story.EnumC79476b;
import com.p2082ss.android.ugc.aweme.tux.business.story.StoryBrandView;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tux.business.a.a */
public final class C79468a {
    static {
        Covode.recordClassIndex(92666);
    }

    /* renamed from: a */
    public static void m138189a(StoryBrandView storyBrandView, ViewGroup.LayoutParams layoutParams) {
        C89219l.m154721d(storyBrandView, "");
        C89219l.m154721d(layoutParams, "");
    }

    /* renamed from: a */
    public static boolean m138190a(String str, C1863a aVar, StoryBrandView storyBrandView, ViewGroup.LayoutParams layoutParams) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(storyBrandView, "");
        C89219l.m154721d(layoutParams, "");
        switch (str.hashCode()) {
            case -1535121397:
                if (!str.equals("app:radius")) {
                    return false;
                }
                Context context = storyBrandView.getContext();
                C89219l.m154716b(context, "");
                storyBrandView.setRadius(C1869a.m6037a(context, aVar));
                return true;
            case 681713385:
                if (!str.equals("app:theme_type")) {
                    return false;
                }
                String str2 = aVar.f5673a;
                if (str2 != null) {
                    int hashCode = str2.hashCode();
                    if (hashCode != -358423381) {
                        if (hashCode != -350297506) {
                            if (hashCode == 1373927726 && str2.equals("brand_dark")) {
                                storyBrandView.setThemeType(EnumC79476b.DARK);
                            }
                        } else if (str2.equals("brand_light")) {
                            storyBrandView.setThemeType(EnumC79476b.LIGHT);
                        }
                    } else if (str2.equals("brand_const")) {
                        storyBrandView.setThemeType(EnumC79476b.CONST);
                    }
                }
                return true;
            case 887664112:
                if (!str.equals("app:ring_width")) {
                    return false;
                }
                Context context2 = storyBrandView.getContext();
                C89219l.m154716b(context2, "");
                storyBrandView.setRingWidth(C1869a.m6037a(context2, aVar));
                return true;
            case 1506662996:
                if (!str.equals("app:brand_mode")) {
                    return false;
                }
                String str3 = aVar.f5673a;
                if (str3 != null) {
                    switch (str3.hashCode()) {
                        case -1459637676:
                            if (str3.equals("brand_fill_circle")) {
                                storyBrandView.setMode(EnumC79475a.BRAND_FILL_CIRCLE);
                                break;
                            }
                            break;
                        case -1001078227:
                            if (str3.equals("progress")) {
                                storyBrandView.setMode(EnumC79475a.PRORGRESS);
                                break;
                            }
                            break;
                        case -923427188:
                            if (str3.equals("gray_ring")) {
                                storyBrandView.setMode(EnumC79475a.GRAY_RING);
                                break;
                            }
                            break;
                        case -785375970:
                            if (str3.equals("red_ring")) {
                                storyBrandView.setMode(EnumC79475a.RED_RING);
                                break;
                            }
                            break;
                        case 1374352360:
                            if (str3.equals("brand_ring")) {
                                storyBrandView.setMode(EnumC79475a.BRAND_RING);
                                break;
                            }
                            break;
                        case 1639822566:
                            if (str3.equals("brand_background")) {
                                storyBrandView.setMode(EnumC79475a.BRAND_BACKGROUND);
                                break;
                            }
                            break;
                    }
                }
                return true;
            default:
                return false;
        }
    }
}
