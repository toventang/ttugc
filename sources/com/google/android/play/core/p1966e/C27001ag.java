package com.google.android.play.core.p1966e;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.play.core.p1963b.C26896an;
import com.google.android.play.core.p1965d.C26991q;
import com.kakao.usermgmt.StringSet;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.google.android.play.core.e.ag */
public final class C27001ag {

    /* renamed from: a */
    private static AbstractC27003ai f63902a;

    static {
        Covode.recordClassIndex(32477);
    }

    private C27001ag() {
    }

    /* renamed from: a */
    private static String m53650a(String str, XmlPullParser xmlPullParser) {
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    /* renamed from: a */
    private static void m53651a(XmlPullParser xmlPullParser) {
        int i = 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next != 3) {
                continue;
            } else {
                i--;
            }
            if (i == 0) {
                return;
            }
        }
    }

    /* renamed from: a */
    public static synchronized AbstractC27003ai m53649a(Context context) {
        AbstractC27003ai aiVar;
        synchronized (C27001ag.class) {
            MethodCollector.m26663i(13089);
            if (f63902a == null) {
                C27052x xVar = new C27052x((byte) 0);
                xVar.f64021a = new C27015au(C26991q.m53630a(context));
                C26896an.m53420a(xVar.f64021a, C27015au.class);
                f63902a = new C27053y(xVar.f64021a);
            }
            aiVar = f63902a;
            MethodCollector.m26664o(13089);
        }
        return aiVar;
    }

    /* renamed from: a */
    static C26998ad m53648a(XmlPullParser xmlPullParser, C26997ac acVar) {
        String a;
        while (xmlPullParser.next() != 1) {
            try {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("splits")) {
                        while (xmlPullParser.next() != 3) {
                            if (xmlPullParser.getEventType() == 2) {
                                if (!xmlPullParser.getName().equals("module") || (a = m53650a(StringSet.name, xmlPullParser)) == null) {
                                    m53651a(xmlPullParser);
                                } else {
                                    while (xmlPullParser.next() != 3) {
                                        if (xmlPullParser.getEventType() == 2) {
                                            if (xmlPullParser.getName().equals("language")) {
                                                while (xmlPullParser.next() != 3) {
                                                    if (xmlPullParser.getEventType() == 2) {
                                                        if (xmlPullParser.getName().equals("entry")) {
                                                            String a2 = m53650a("key", xmlPullParser);
                                                            String a3 = m53650a("split", xmlPullParser);
                                                            m53651a(xmlPullParser);
                                                            if (!(a2 == null || a3 == null)) {
                                                                if (!acVar.f63894a.containsKey(a2)) {
                                                                    acVar.f63894a.put(a2, new HashMap());
                                                                }
                                                                acVar.f63894a.get(a2).put(a, a3);
                                                            }
                                                        } else {
                                                            m53651a(xmlPullParser);
                                                        }
                                                    }
                                                }
                                            } else {
                                                m53651a(xmlPullParser);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        m53651a(xmlPullParser);
                    }
                }
            } catch (IOException | IllegalStateException | XmlPullParserException unused) {
                return null;
            }
        }
        return acVar.mo44701a();
    }
}
