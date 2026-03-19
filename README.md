javac HeapClasher.java

java -Xmx128M \
-XX:OnOutOfMemoryError='curl -H "Content-Type: application/json" -X POST -d "{\"status\":\"OutOfMemory\",\"host\":\"$(hostname)\"}" http://<IP_DE_TU_EDA>:5000/endpoint' \
HeapClasher


ssh-keygen -f "/home/adelahoz/.ssh/known_hosts" -R "[127.0.0.1]:30022"
ssh fedora@127.0.0.1 -p 30022

ssh fedora@127.0.0.1 -p 2222

ansible-playbook playbook-install-initial.yaml
ansible-playbook -i inventory playbook-install-initial.yaml
ansible-playbook -i inventory playbook-config-fedora-only.yaml

virtctl -n virtualization-test ssh fedora@fedora-chocolate-smelt-74 --identity-file=<path_to_sshkey>


https://catalog.redhat.com/en/search?searchType=Containers&build_categories_list=Automation+execution+environment


http://catalog.redhat.com/en/software/containers/ansible-automation-platform-26/de-supported-rhel9/66fed7b3b603033a6460028a


curl -v -H 'Content-Type: application/json' \
     -X POST \
     -d '{"status":"OutOfMemory","host":"fedora-test"}' \
     https://route-salmon-bug-ansible-automation-platform.apps.cluster-kmgn4.dynamic.redhatworkshops.io/

curl -H "Content-Type: application/json" -X POST https://eda-webhook-external-ansible-automation-platform.apps.cluster-kmgn4.dynamic.redhatworkshops.io -d '{"status": "OutOfMemory","host": "jboss-prod-01", "message": "Heap space error detected in logs"}'