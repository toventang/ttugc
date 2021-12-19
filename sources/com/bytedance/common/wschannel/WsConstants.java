package com.bytedance.common.wschannel;

import com.bytedance.common.wschannel.app.AbstractC13648b;
import com.bytedance.common.wschannel.app.AbstractC13650d;
import com.bytedance.common.wschannel.app.AbstractC13651e;
import com.bytedance.common.wschannel.p912b.EnumC13655c;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class WsConstants {
    private static volatile AbstractC13652b<Boolean> optLogic = C13656c.f33177a;
    private static AbstractC13648b sBindWsChannelServiceListener;
    private static String sConnectionChangeListenerClassName;
    private static String sLinkProcessChangeListenerClassName;
    private static AbstractC13650d sLinkProgressChangeListener;
    private static AbstractC13651e sListener;
    private static Map<Integer, EnumC13655c> sStates = new ConcurrentHashMap();

    public static AbstractC13648b getBindWsChannelServiceListener() {
        return sBindWsChannelServiceListener;
    }

    public static String getConnectionChangeListenerClassName() {
        return sConnectionChangeListenerClassName;
    }

    public static String getLinkProcessChangeListenerClassName() {
        return sLinkProcessChangeListenerClassName;
    }

    public static AbstractC13650d getLinkProgressChangeListener() {
        return sLinkProgressChangeListener;
    }

    public static AbstractC13652b<Boolean> getOptLogic() {
        return optLogic;
    }

    static {
        Covode.recordClassIndex(15672);
    }

    public static AbstractC13651e getListener(int i) {
        return sListener;
    }

    public static void setBindWsChannelServiceListener(AbstractC13648b bVar) {
        sBindWsChannelServiceListener = bVar;
    }

    public static void setConnectionChangeListenerClassName(String str) {
        sConnectionChangeListenerClassName = str;
    }

    public static void setLinkProcessChangeListenerClassName(String str) {
        sLinkProcessChangeListenerClassName = str;
    }

    static void setOnLinkProgressChangeListener(AbstractC13650d dVar) {
        sLinkProgressChangeListener = dVar;
    }

    static void setOnMessageReceiveListener(AbstractC13651e eVar) {
        sListener = eVar;
    }

    static void setOptLogic(AbstractC13652b<Boolean> bVar) {
        if (bVar != null) {
            optLogic = bVar;
        }
    }

    public static void remove(int i) {
        sStates.remove(Integer.valueOf(i));
    }

    static boolean isWsChannelConnected(int i) {
        if (sStates.get(Integer.valueOf(i)) == EnumC13655c.CONNECTED) {
            return true;
        }
        return false;
    }

    public static void setConnectionState(int i, EnumC13655c cVar) {
        sStates.put(Integer.valueOf(i), cVar);
    }
}
