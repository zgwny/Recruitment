
        function profileEdit() {
            document.getElementById("profile-pre-wrapper").style.display = "none";
            document.getElementById("profile-edit-wrapper").style.display = "block";
        }
        function profileEditCancle() {
            document.getElementById("profile-pre-wrapper").style.display = "block";
            document.getElementById("profile-edit-wrapper").style.display = "none";
        }
        function wannaEdit() {
            document.getElementById("wanna-pre-wrapper").style.display = "none";
            document.getElementById("wanna-edit-wrapper").style.display = "block";
        }
        function wannaEditCancle() {
            document.getElementById("wanna-pre-wrapper").style.display = "block";
            document.getElementById("wanna-edit-wrapper").style.display = "none";
        }
        function jobExpAdd() {
            document.getElementById("job-exp-add-wrapper").style.display = "block";
        }
        function jobExpAddCancle() {
            document.getElementById("job-exp-add-wrapper").style.display = "none";
        }
        function jobExpEdit(id) {
            document.getElementById("job-exp-edit-wrapper-"+id).style.display = "block";
            document.getElementById("job-exp-edit-id-"+id).value =id ;
        }
        function jobExpEditCancle(id) {
            document.getElementById("job-exp-edit-wrapper-"+id).style.display = "none";
        }
        function projectExpAdd() {
            document.getElementById("project-exp-add-wrapper").style.display = "block";

        }
        function projectExpAddCancle() {
            document.getElementById("project-exp-add-wrapper").style.display = "none";
        }

        function projectExpEdit(id) {
            document.getElementById("project-exp-edit-wrapper-"+id).style.display = "block";
            document.getElementById("project-exp-edit-id-"+id).value =id ;
        }

        function projectExpEditCancle(id) {
            document.getElementById("project-exp-edit-wrapper-"+id).style.display = "none";
        }
        function eduExpAdd() {
            document.getElementById("edu-Add-panel").style.display = "block";

        }
        function eduExpAddCancle() {
            document.getElementById("edu-Add-panel").style.display = "none";
        }
        function eduExpEdit(id) {
            document.getElementById("edu-edit-panel-"+id).style.display = "block";
            document.getElementById("edu-edit-id-"+id).value = id;
        }
        function eduExpEditCancle(id) {
            document.getElementById("edu-edit-panel-"+id).style.display = "none";
        }
        function zplanguaAdd() {
            document.getElementById("language-add-panel").style.display = "block";

        }
        function zplanguaAddCancle() {
            document.getElementById("language-add-panel").style.display = "none";
        }

        function zplanguaEdit(id) {
            document.getElementById("language-edit-panel-"+id).style.display = "block";
            document.getElementById("language-edit-id-"+id).value= id;
        }

        function zplanguaEditCancle(id) {
            document.getElementById("language-edit-panel-"+id).style.display = "none";
        }
        function centificateAdd() {
            document.getElementById("zp-certificate-add-status").style.display = "block";

        }
        function certificationAddCancle() {
            document.getElementById("zp-certificate-add-status").style.display = "none";
        }
        function certificationEdit(id) {
            document.getElementById("zp-certificate-edit-status-"+id).style.display = "block";
            document.getElementById("zp-certificate-edit-id-"+id).value = id;
        }

        function certificationEditCancle(id) {
            document.getElementById("zp-certificate-edit-status-"+id).style.display = "none";
        }
        function zpEvalutionEdit() {
            document.getElementById("zp-evalution-edit").style.display = "block";

        }
        function zpEvalutionEditCancle() {
            document.getElementById("zp-evalution-edit").style.display = "none";
        }
