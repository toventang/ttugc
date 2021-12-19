package com.p2082ss.android.ugc.aweme.journey.step.interestselector;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.journey.C56873q;
import com.p2082ss.android.ugc.aweme.journey.C57054w;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import com.p2082ss.android.ugc.trill.R;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.LinkedList;
import java.util.List;
import p4600h.p4610e.C89146c;
import p4600h.p4610e.C89167q;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89338d;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.journey.step.interestselector.b */
public final class C56972b {
    static {
        Covode.recordClassIndex(66860);
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.interestselector.b$a */
    public static final class C56973a extends C27895a<List<? extends C57054w>> {
        static {
            Covode.recordClassIndex(66861);
        }

        C56973a() {
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static final List<C57054w> m103326a(Context context) {
        String string;
        MethodCollector.m26663i(6928);
        C89219l.m154721d(context, "");
        InputStream open = context.getAssets().open("interest_list/interest_list_" + ((String) C56873q.f129525h.getValue()) + ".json");
        C89219l.m154716b(open, "");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open, C89338d.f202990a), 8192);
        try {
            String a = C89167q.m154662a((Reader) bufferedReader);
            C89146c.m154636a(bufferedReader, null);
            List<C57054w> list = (List) C80342dg.m139300a().mo46671a(a, new C56973a().type);
            if (list == null || list.isEmpty()) {
                list = new LinkedList<>();
            }
            for (C57054w wVar : list) {
                String str = wVar.f129912a;
                C89219l.m154721d(str, "");
                C89219l.m154721d(context, "");
                switch (str.hashCode()) {
                    case -2028215897:
                        if (str.equals("Clothing & Apparel")) {
                            string = context.getString(R.string.ddh);
                            C89219l.m154716b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case -1963180254:
                        if (str.equals("Kollywood")) {
                            string = context.getString(R.string.de0);
                            C89219l.m154716b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case -1811893345:
                        if (str.equals("Sports")) {
                            string = context.getString(R.string.dec);
                            C89219l.m154716b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case -1797219060:
                        if (str.equals("Talent")) {
                            string = context.getString(R.string.dee);
                            C89219l.m154716b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case -1781830854:
                        if (str.equals("Travel")) {
                            string = context.getString(R.string.deh);
                            C89219l.m154716b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case -1082679165:
                        if (str.equals("Oddly Satisfying")) {
                            string = context.getString(R.string.de9);
                            C89219l.m154716b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case -1050401237:
                        if (str.equals("Tollywood")) {
                            string = context.getString(R.string.de5);
                            C89219l.m154716b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case -833750813:
                        if (str.equals("Daily Life")) {
                            string = context.getString(R.string.ddj);
                            C89219l.m154716b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case -752113842:
                        if (str.equals("Life Hacks")) {
                            if (C89361p.m154872a("US", C56873q.m103136a(), true)) {
                                string = context.getString(R.string.dej);
                            } else {
                                string = context.getString(R.string.ddm);
                            }
                            C89219l.m154716b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case -720253902:
                        if (str.equals("Science & Education")) {
                            string = context.getString(R.string.deb);
                            C89219l.m154716b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case -686144149:
                        if (str.equals("Occupation")) {
                            string = context.getString(R.string.de8);
                            C89219l.m154716b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case -317480538:
                        if (str.equals("Emotional")) {
                            string = context.getString(R.string.ddx);
                            C89219l.m154716b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case -254629764:
                        if (str.equals("Motivation & Advice")) {
                            string = context.getString(R.string.de7);
                            C89219l.m154716b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case -210304353:
                        if (str.equals("Pop Culture")) {
                            string = context.getString(R.string.dea);
                            C89219l.m154716b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case -86374264:
                        if (str.equals("Fashion Accessories")) {
                            string = context.getString(R.string.ddq);
                            C89219l.m154716b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case 66115:
                        if (str.equals("Art")) {
                            string = context.getString(R.string.ddd);
                            C89219l.m154716b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case 67700:
                        if (str.equals("DIY")) {
                            string = context.getString(R.string.dei);
                            C89219l.m154716b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case 2052559:
                        if (str.equals("Auto")) {
                            string = context.getString(R.string.dde);
                            C89219l.m154716b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case 2195582:
                        if (str.equals("Food")) {
                            string = context.getString(R.string.dds);
                            C89219l.m154716b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case 2602678:
                        if (str.equals("Tech")) {
                            string = context.getString(R.string.def);
                            C89219l.m154716b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case 65798035:
                        if (str.equals("Dance")) {
                            string = context.getString(R.string.ddk);
                            C89219l.m154716b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case 66292295:
                        if (str.equals("Drama")) {
                            string = context.getString(R.string.ddn);
                            C89219l.m154716b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case 74710533:
                        if (str.equals("Music")) {
                            string = context.getString(R.string.dek);
                            C89219l.m154716b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case 123562007:
                        if (str.equals("Outdoors")) {
                            string = context.getString(R.string.de_);
                            C89219l.m154716b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case 169588576:
                        if (str.equals("Tech & Science")) {
                            string = context.getString(R.string.de4);
                            C89219l.m154716b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case 400139022:
                        if (str.equals("Fitness & Health")) {
                            string = context.getString(R.string.ddr);
                            C89219l.m154716b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case 587876755:
                        if (str.equals("Beauty & Style")) {
                            string = context.getString(R.string.ddf);
                            C89219l.m154716b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case 807717335:
                        if (str.equals("Animals")) {
                            string = context.getString(R.string.ddc);
                            C89219l.m154716b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case 982113085:
                        if (str.equals("Arts & Crafts")) {
                            string = context.getString(R.string.ddv);
                            C89219l.m154716b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case 1085311376:
                        if (str.equals("Home & Garden")) {
                            string = context.getString(R.string.ddu);
                            C89219l.m154716b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case 1298968424:
                        if (str.equals("Entertainment")) {
                            string = context.getString(R.string.ddy);
                            C89219l.m154716b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case 1414863620:
                        if (str.equals("Home decor")) {
                            string = context.getString(R.string.ddz);
                            C89219l.m154716b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case 1419008025:
                        if (str.equals("Bollywood")) {
                            string = context.getString(R.string.ddw);
                            C89219l.m154716b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case 1461903030:
                        if (str.equals("Motivation")) {
                            string = context.getString(R.string.de2);
                            C89219l.m154716b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case 1638848318:
                        if (str.equals("Learning")) {
                            string = context.getString(R.string.de1);
                            C89219l.m154716b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case 1665004953:
                        if (str.equals("Nature & Wildlife")) {
                            string = context.getString(R.string.de3);
                            C89219l.m154716b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case 1961668532:
                        if (str.equals("DIY & Life Hacks")) {
                            string = context.getString(R.string.ddm);
                            C89219l.m154716b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case 2024011449:
                        if (str.equals("Comedy")) {
                            string = context.getString(R.string.ddi);
                            C89219l.m154716b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case 2096973700:
                        if (str.equals("Family")) {
                            string = context.getString(R.string.ddo);
                            C89219l.m154716b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case 2096998767:
                        if (str.equals("Fandom")) {
                            string = context.getString(R.string.ddp);
                            C89219l.m154716b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case 2125602895:
                        if (str.equals("Gaming")) {
                            string = context.getString(R.string.ddt);
                            C89219l.m154716b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    default:
                        string = "";
                        break;
                }
                if (!TextUtils.isEmpty(string)) {
                    wVar.f129913b = string;
                }
            }
            MethodCollector.m26664o(6928);
            return list;
        } catch (Throwable th) {
            C89146c.m154636a(bufferedReader, th);
            MethodCollector.m26664o(6928);
            throw th;
        }
    }
}
