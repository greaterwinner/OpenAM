/*
 * The contents of this file are subject to the terms of the Common Development and
 * Distribution License (the License). You may not use this file except in compliance with the
 * License.
 *
 * You can obtain a copy of the License at legal/CDDLv1.0.txt. See the License for the
 * specific language governing permission and limitations under the License.
 *
 * When distributing Covered Software, include this CDDL Header Notice in each file and include
 * the License file at legal/CDDLv1.0.txt. If applicable, add the following below the CDDL
 * Header, with the fields enclosed by brackets [] replaced by your own identifying
 * information: "Portions copyright [year] [name of copyright owner]".
 *
 * Copyright 2015 ForgeRock AS.
 */


define("org/forgerock/openam/ui/user/login/LoginFailureView", [
    "jquery",
    "org/forgerock/commons/ui/common/main/AbstractView"
], function ($, AbstractView) {

    var LoginFailureView = AbstractView.extend({
        template: "templates/openam/ReturnToLoginTemplate.html",
        baseTemplate: "templates/common/LoginBaseTemplate.html",
        data: {},
        render: function (args) {
            var subrealm = args[0],
                params = args[1];

            if (subrealm.charAt(0) === "/") {
                subrealm = subrealm.substr(1);
            }
            this.data.fragment = subrealm + params;
            this.data.title = $.t("openam.authentication.unavailable");
            this.parentRender();
        }
    });

    return new LoginFailureView();
});
