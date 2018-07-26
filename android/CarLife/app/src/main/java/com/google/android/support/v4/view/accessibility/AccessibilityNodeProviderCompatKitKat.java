package com.google.android.support.v4.view.accessibility;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

class AccessibilityNodeProviderCompatKitKat {

    interface AccessibilityNodeInfoBridge {
        Object createAccessibilityNodeInfo(int i);

        List<Object> findAccessibilityNodeInfosByText(String str, int i);

        Object findFocus(int i);

        boolean performAction(int i, int i2, Bundle bundle);
    }

    /* renamed from: com.google.android.support.v4.view.accessibility.AccessibilityNodeProviderCompatKitKat$1 */
    class C56741 extends AccessibilityNodeProvider {
        private final /* synthetic */ AccessibilityNodeInfoBridge val$bridge;

        C56741(AccessibilityNodeInfoBridge accessibilityNodeInfoBridge) {
            this.val$bridge = accessibilityNodeInfoBridge;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int virtualViewId) {
            return (AccessibilityNodeInfo) this.val$bridge.createAccessibilityNodeInfo(virtualViewId);
        }

        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String text, int virtualViewId) {
            return this.val$bridge.findAccessibilityNodeInfosByText(text, virtualViewId);
        }

        public boolean performAction(int virtualViewId, int action, Bundle arguments) {
            return this.val$bridge.performAction(virtualViewId, action, arguments);
        }

        public AccessibilityNodeInfo findFocus(int focus) {
            return (AccessibilityNodeInfo) this.val$bridge.findFocus(focus);
        }
    }

    AccessibilityNodeProviderCompatKitKat() {
    }

    public static Object newAccessibilityNodeProviderBridge(AccessibilityNodeInfoBridge bridge) {
        return new C56741(bridge);
    }
}
